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
import org.springframework.web.bind.annotation.*;

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
    private int sid;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/admin")
    public String admin(){
        return "admin";
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
        User user1 = salesService.loginByUserNameAndPassword(user);
        System.out.println(user1);
        if (user1 == null || user1.getIdentity() == 0){
            model.addAttribute("message", "账号或密码错误");
            return "login";
        }
        return home(model);
    }
    @PostMapping("/loginByAdminNameAndPassword")
    public String loginByAdminNameAndPassword(User user, Model model){
        System.out.println(user);
        User user1 = salesService.loginByUserNameAndPassword(user);
        System.out.println(user1);
        if (user1 == null || user1.getIdentity() != 0){
            model.addAttribute("message", "账号或密码错误");
            return "admin";
        }

        return "redirect:http://localhost/back/chain/init";

    }
    @RequestMapping("/product/sid/{sid}")
    public String generateConfigurationSheet(@PathVariable int sid, Model model){
        ProductSeries productSeries = salesService.selectByPrimaryKey(sid);
        List<ProductNumber> productNumbers = salesService.selectBypsid(sid);
        List<Accessories> accessories = salesService.getAccessories();
        model.addAttribute("productNumbers", productNumbers);
        model.addAttribute("navigation", productSeries);
        model.addAttribute("accessories", accessories);
        return home(model);
    }

    @RequestMapping("retrieveData")
    @ResponseBody
    public String retrieveData(@RequestParam("sid") int sid){
        List<ProductNumber> productNumbers = salesService.selectBypsid(sid);
        return JSON.toJSONString(productNumbers);
    }


}
