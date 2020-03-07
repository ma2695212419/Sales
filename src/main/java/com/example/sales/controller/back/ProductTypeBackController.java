package com.example.sales.controller.back;

import com.example.sales.model.entity.ProductChain;
import com.example.sales.model.entity.ProductType;
import com.example.sales.model.vo.ProductTypeVo;
import com.example.sales.service.back.ProductChainBackService;
import com.example.sales.service.back.ProductTypeBackService;
import com.example.sales.utils.AjaxUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
@RequestMapping("/back/type")
public class ProductTypeBackController {

    @Resource
    private ProductTypeBackService productTypeBackService;

    @Resource
    private ProductChainBackService productChainBackService;

    @RequestMapping("/init")
    public String init(Model model) {
        List<ProductTypeVo> typeVo = productTypeBackService.getProductTypes();
        model.addAttribute("typeVo", typeVo);
        List<ProductChain> chain = productChainBackService.getChain();
        model.addAttribute("chain", chain);
        return "back-product-type-management";
    }

    @PostMapping("/add")
    public void add(ProductType productType, HttpServletResponse response) {
        boolean b = false;
        if (productType.getPtname() != null && productType.getPtname() != "" && productType.getPcid() != null && productType.getPcid() > 0) {
            b = productTypeBackService.addProductType(productType);
        }
        AjaxUtils.jsonforword(b, response);
    }

    @PostMapping("/upd")
    public void upd(ProductType productType, HttpServletResponse response) {
        boolean b = false;
        if (productType.getPtname() != null && productType.getPtname() != "" && productType.getPcid() != null && productType.getPcid() > 0) {
            b = productTypeBackService.updProductType(productType);
        }
        AjaxUtils.jsonforword(b, response);
    }

    @PostMapping("/del")
    public void del(@RequestParam("ptid") Integer ptid, HttpServletResponse response) {
        boolean b = productTypeBackService.delProductType(ptid);
        AjaxUtils.jsonforword(b, response);
    }


}
