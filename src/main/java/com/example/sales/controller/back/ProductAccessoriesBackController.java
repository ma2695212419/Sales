package com.example.sales.controller.back;

import com.example.sales.model.entity.Accessories;
import com.example.sales.service.back.ProductAccessoriesBackService;
import com.example.sales.utils.AjaxUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author 王雨
 * @version 1.0
 * @date 2020/3/5 20:58
 * @package com.example.sales.controller.back
 */
@Controller
@RequestMapping("/back/accessories")
public class ProductAccessoriesBackController {

    @Resource
    private ProductAccessoriesBackService productAccessoriesBackService;

    @RequestMapping("/init")
    public String init(Model model) {
        List<Accessories> accessories = productAccessoriesBackService.getAccessories();
        model.addAttribute("accessories", accessories);
        return "back-product-accessories-management";
    }

    @PostMapping("/add")
    public void add(Accessories accessories, HttpServletResponse response) {
        boolean b = productAccessoriesBackService.addAccessories(accessories);
        AjaxUtils.jsonforword(b,response);
    }

    @PostMapping("/upd")
    public void upd(Accessories accessories, HttpServletResponse response) {
        boolean b = productAccessoriesBackService.updAccessories(accessories);
        AjaxUtils.jsonforword(b,response);
    }

    @PostMapping("/del")
    public void del(Integer pcid,HttpServletResponse response) {
        boolean b = productAccessoriesBackService.delAccessories(pcid);
        AjaxUtils.jsonforword(b,response);
    }


}
