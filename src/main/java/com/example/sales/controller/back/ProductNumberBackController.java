package com.example.sales.controller.back;

import com.example.sales.model.entity.ProductNumber;
import com.example.sales.model.vo.ProductNumberVo;
import com.example.sales.model.vo.ProductSeriesVo;
import com.example.sales.service.back.ProductNumberBackService;
import com.example.sales.service.back.ProductSeriesBackService;
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
@RequestMapping("/back/number")
public class ProductNumberBackController {

    @Resource
    private ProductNumberBackService productNumberBackService;

    @Resource
    private ProductSeriesBackService productSeriesBackService;

    @RequestMapping("/init")
    public String init(Model model) {
        List<ProductNumberVo> numberVo = productNumberBackService.getProductNumbers();
        model.addAttribute("numberVo", numberVo);
        List<ProductSeriesVo> series = productSeriesBackService.getProductSeries();
        model.addAttribute("series", series);
        return "back-product-number-management";
    }

    @PostMapping("/add")
    public void add(ProductNumber productNumber, HttpServletResponse response) {
        boolean b = false;
        if (productNumber.getPnname() != null && productNumber.getPnname() != ""
                && productNumber.getPsid() != null && productNumber.getPsid() > 0
                && productNumber.getPrice() != null && productNumber.getPrice() > 0
                && productNumber.getDescription() != null && productNumber.getDescription() != ""
                && productNumber.getDiversity() != null && productNumber.getDiversity() != ""){
            b = productNumberBackService.addProductNumber(productNumber);
        }
        AjaxUtils.jsonforword(b, response);
    }

    @PostMapping("/upd")
    public void upd(ProductNumber productNumber, HttpServletResponse response) {
        boolean b = false;
        if (productNumber.getPnname() != null && productNumber.getPnname() != ""
                && productNumber.getPsid() != null && productNumber.getPsid() > 0
                && productNumber.getPrice() != null && productNumber.getPrice() > 0
                && productNumber.getDescription() != null && productNumber.getDescription() != ""
                && productNumber.getDiversity() != null && productNumber.getDiversity() != ""){
            b = productNumberBackService.updProductNumber(productNumber);
        }
        AjaxUtils.jsonforword(b, response);
    }

    @PostMapping("/del")
    public void del(@RequestParam("pnid") Integer pnid, HttpServletResponse response) {
        boolean b = productNumberBackService.delProductNumber(pnid);
        AjaxUtils.jsonforword(b, response);
    }


}
