package com.example.sales.controller.frontdesk;

import com.example.sales.model.entity.ProductSeries;
import com.example.sales.service.front.SalesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author 马泽朋
 * @version 1.0
 * @date 2020/3/14 下午 3:56
 */
@Controller
@RequestMapping("/product")
public class Product {
    @Resource
    private SalesService salesService;
    @RequestMapping("/sid/{sid}")
    public String generateConfigurationSheet(@PathVariable int sid, Model model){
        ProductSeries productSeries = salesService.selectByPrimaryKey(sid);
        System.out.println(productSeries);
        return null;
    }
}
