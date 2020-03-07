package com.example.sales.controller.back;

import com.example.sales.model.entity.ProductSeries;
import com.example.sales.model.vo.ProductSeriesVo;
import com.example.sales.model.vo.ProductTypeVo;
import com.example.sales.service.back.ProductSeriesBackService;
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
@RequestMapping("/back/series")
public class ProductSeriesBackController {

    @Resource
    private ProductSeriesBackService productSeriesBackService;

    @Resource
    private ProductTypeBackService productTypeBackService;

    @RequestMapping("/init")
    public String init(Model model) {
        List<ProductSeriesVo> seriesVo = productSeriesBackService.getProductSeries();
        model.addAttribute("seriesVo", seriesVo);
        List<ProductTypeVo> type = productTypeBackService.getProductTypes();
        model.addAttribute("type", type);
        return "back-product-series-management";
    }

    @PostMapping("/add")
    public void add(ProductSeries productSeries, HttpServletResponse response) {
        boolean b = false;
        if (productSeries.getPsname() != null && productSeries.getPsname() != "" && productSeries.getPtid() != null && productSeries.getPtid() > 0){
            b = productSeriesBackService.addProductSeries(productSeries);
        }
        AjaxUtils.jsonforword(b,response);
    }

    @PostMapping("/upd")
    public void upd(ProductSeries productSeries, HttpServletResponse response) {
        boolean b = false;
        if (productSeries.getPsname() != null && productSeries.getPsname() != "" && productSeries.getPtid() != null && productSeries.getPtid() > 0){
            b = productSeriesBackService.updProductSeries(productSeries);
        }
        AjaxUtils.jsonforword(b,response);
    }

    @PostMapping("/del")
    public void del(@RequestParam("psid")Integer psid, HttpServletResponse response) {
        boolean b = false;
        b = productSeriesBackService.delProductSeries(psid);
        AjaxUtils.jsonforword(b,response);
    }


}
