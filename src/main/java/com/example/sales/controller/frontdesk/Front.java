package com.example.sales.controller.frontdesk;

import com.example.sales.dao.UserDao;
import com.example.sales.model.entity.*;
import com.example.sales.model.vo.Product;
import com.example.sales.service.front.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 马泽朋
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
        model.addAttribute("configuringSingles",configuringSingles);
        home(model);
        return "sales_order";
    }

    @PostMapping("/loginByUserNameAndPassword")
    public String loginByUserNameAndPassword(User user, Model model){
        System.out.println(user.getUname());
        System.out.println(user.getUpassword());
        User user1 = salesService.loginByUserNameAndPassword(user);
        if (user1.getIdentity() == 0){
            return "管理端";
        }
        return home(model);
    }

}
