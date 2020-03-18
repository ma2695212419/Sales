package com.example.sales.controller.back;

import com.example.sales.model.entity.ProductChain;
import com.example.sales.service.back.ProductChainBackService;
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
 * @author
 * @version 1.0
 * @date 2020/3/5 15:43
 * @package com.example.sales.controller.back
 */
@Controller
@RequestMapping("/back/chain")
public class ProductChainBackController {

    @Resource
    private ProductChainBackService productChainBackService;

    @RequestMapping("/init")
    public String init(Model model) {
        List<ProductChain> chain = productChainBackService.getChain();
        model.addAttribute("chain", chain);
        return "back-product-chain-management";
    }

    @PostMapping("/add")
    public void add(ProductChain productChain, HttpServletResponse response) {
        boolean b = false;
        if (productChain.getPcname()!=null && productChain.getPcname()!= ""){
            b = productChainBackService.addProductChain(productChain);
        }
        AjaxUtils.jsonforword(b, response);
    }

    @PostMapping("/upd")
    public void upd(ProductChain productChain, HttpServletResponse response) {
        boolean b = false;
        if (productChain.getPcname()!=null && productChain.getPcname()!= ""){
            b = productChainBackService.updProductChain(productChain);
        }
        AjaxUtils.jsonforword(b, response);
    }

    @PostMapping("/del")
    public void del(@RequestParam("pcid")Integer pcid, HttpServletResponse response) {
        boolean b = productChainBackService.delProductChain(pcid);
        AjaxUtils.jsonforword(b, response);
    }

}
