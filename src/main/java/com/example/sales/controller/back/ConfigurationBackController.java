package com.example.sales.controller.back;

import cn.hutool.core.date.DateUtil;
import com.example.sales.model.entity.ConfiguringSingle;
import com.example.sales.model.vo.Configuration;
import com.example.sales.service.back.ConfigurationService;
import com.example.sales.utils.AjaxUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2020/3/14 15:37
 * @package com.example.sales.controller.back
 */
@Controller
@RequestMapping("/back/configuration")
public class ConfigurationBackController {

    @Resource
    private ConfigurationService configurationService;

    @RequestMapping("/init")
    public String init() {
        return "back-product-configuration-management";
    }

    @RequestMapping("/query")
    public String query(@RequestParam(value = "uname", required = false) String uname,
                        @RequestParam(value = "saleDate", required = false) String saleDate,
                        @RequestParam(value = "cid", required = false) String cid,
                        @RequestParam(value = "clientName", required = false) String clientName,
                        @RequestParam(value = "ucontactPerson", required = false) String ucontactPerson,
                        @RequestParam(value = "uphone", required = false) String uphone,
                        @RequestParam(value = "umail", required = false) String umail,
                        @RequestParam(value = "quotationUnit", required = false) String quotationUnit,
                        @RequestParam(value = "ccontactPerson", required = false) String ccontactPerson,
                        @RequestParam(value = "cphone", required = false) String cphone,
                        @RequestParam(value = "cmail", required = false) String cmail,
                        Model model) {
        System.out.println(uname);
        System.out.println(saleDate);
        System.out.println(cid);
        System.out.println(clientName);
        System.out.println(ucontactPerson);
        System.out.println(uphone);
        System.out.println(umail);
        System.out.println(quotationUnit);
        System.out.println(ccontactPerson);
        System.out.println(cphone);
        System.out.println(cmail);
        Configuration configuration = new Configuration();
        if (uname != null && uname != "") {
            configuration.setUname(uname);
        }
        if (saleDate != null && saleDate != "") {
            configuration.setSaleDate(saleDate);
        }
        if (cid != null && cid != "") {
            configuration.setCid(cid);
        }
        if (clientName != null && clientName != "") {
            configuration.setClientName(clientName);
        }
        if (ucontactPerson != null && ucontactPerson != "") {
            configuration.setUcontactPerson(ucontactPerson);
        }
        if (uphone != null && uphone != "") {
            configuration.setUphone(uphone);
        }
        if (umail != null && umail != "") {
            configuration.setUmail(umail);
        }
        if (quotationUnit != null && quotationUnit != "") {
            configuration.setQuotationUnit(quotationUnit);
        }
        if (ccontactPerson != null && ccontactPerson != "") {
            configuration.setCcontactPerson(ccontactPerson);
        }
        if (cphone != null && cphone != "") {
            configuration.setCphone(cphone);
        }
        if (cmail != null && cmail != "") {
            configuration.setCmail(cmail);
        }
        List<Configuration> configurationList = configurationService.getConfiguration(configuration);
        model.addAttribute("configurationList", configurationList);
        return "back-product-configuration-management";
    }

//    @PostMapping("/querya")
//    public void query(@RequestParam(value = "uname", required = false) String uname,
//                      @RequestParam(value = "saleDate", required = false) String saleDate,
//                      @RequestParam(value = "cid", required = false) String cid,
//                      @RequestParam(value = "clientName", required = false) String clientName,
//                      @RequestParam(value = "ucontactPerson", required = false) String ucontactPerson,
//                      @RequestParam(value = "uphone", required = false) String uphone,
//                      @RequestParam(value = "umail", required = false) String umail,
//                      @RequestParam(value = "quotationUnit", required = false) String quotationUnit,
//                      @RequestParam(value = "ccontactPerson", required = false) String ccontactPerson,
//                      @RequestParam(value = "cphone", required = false) String cphone,
//                      @RequestParam(value = "cmail", required = false) String cmail,
//                      HttpServletResponse response) {
//        Configuration configuration = new Configuration();
//        if (uname != null && uname != "") {
//            configuration.setUname(uname);
//        }
//        if (saleDate != null && saleDate != "") {
//            Date date = DateUtil.parse(saleDate, "yyyy-MM-dd");
//            configuration.setSaleDate(date);
//        }
//        if (cid != null && cid != "") {
//            configuration.setCid(cid);
//        }
//        if (clientName != null && clientName != "") {
//            configuration.setClientName(clientName);
//        }
//        if (ucontactPerson != null && ucontactPerson != "") {
//            configuration.setUcontactPerson(ucontactPerson);
//        }
//        if (uphone != null && uphone != "") {
//            configuration.setUphone(uname);
//        }
//        if (umail != null && umail != "") {
//            configuration.setUmail(uname);
//        }
//        if (quotationUnit != null && quotationUnit != "") {
//            configuration.setQuotationUnit(uname);
//        }
//        if (ccontactPerson != null && ccontactPerson != "") {
//            configuration.setCcontactPerson(uname);
//        }
//        if (cphone != null && cphone != "") {
//            configuration.setCphone(uname);
//        }
//        if (cmail != null && cmail != "") {
//            configuration.setCmail(cmail);
//        }
//        List<Configuration> configurationList = configurationService.getConfiguration(configuration);
//        AjaxUtils.jsonforword(configurationList, response);
//    }
}
