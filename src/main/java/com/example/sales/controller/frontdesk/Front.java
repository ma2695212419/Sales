package com.example.sales.controller.frontdesk;

import com.alibaba.fastjson.JSON;
import com.example.sales.dao.UserDao;
import com.example.sales.model.entity.*;
import com.example.sales.model.vo.AccessoriesList;
import com.example.sales.model.vo.Product;
import com.example.sales.service.front.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2020/3/4 下午 5:40
 */
@Controller
public class Front {

    @Autowired
    private SalesService salesService;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/home")
    public String home(Model model){
        List<Product> products = new ArrayList<>();
        List<ProductChain> productChains = salesService.getProductChains();
        for (ProductChain productChain : productChains) {
            Product product = new Product();
            product.setPcid(productChain.getPcid());
            product.setPcname(productChain.getPcname());
            List<ProductType> productType = salesService.getProductType(productChain.getPcid());

            for (ProductType type : productType) {
                List<ProductSeries> productSeries = salesService.getProductSeries(type.getPtid());
                type.setProductSeriesList(productSeries);
                for (ProductSeries productSery : productSeries) {
                    List<ProductNumber> productNumber = salesService.getProductNumber(productSery.getPsid());
                    productSery.setProductNumberList(productNumber);
                }
            }
            product.setProductTypeList(productType);
            products.add(product);
        }
        model.addAttribute("productChains", products);
        return "home";
    }

    @RequestMapping("/salesOrder")
    public String salesOrder(Model model){
        List<ConfiguringSingle> configuringSingles = salesService.selectAll();
        List<AccessoriesList> accessoriesLists = salesService.selectInfo();
        model.addAttribute("configuringSingles",configuringSingles);
        model.addAttribute("accessoriesLists",accessoriesLists);
        home(model);
        return "sales_order";
    }

    @PostMapping("/loginByUserNameAndPassword")
    public String loginByUserNameAndPassword(User user, Model model){
        System.out.println(user.getUname());
        System.out.println(user.getUpassword());
        User user1 = salesService.loginByUserNameAndPassword(user);
        if (user1.getIdentity() == 0){
            return "redirect:http://localhost/back/chain/init";
        }
        return home(model);
    }


}
