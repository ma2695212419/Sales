package com.example.sales.controller.back;

import com.example.sales.model.entity.Accessories;
import com.example.sales.model.vo.ConfigurationVo;
import com.example.sales.service.back.ConfigurationService;
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

    @PostMapping("/add")
    public void add(ConfigurationVo configurationVo, HttpServletResponse response) {
        List<ConfigurationVo> configuration = configurationService.getConfiguration(configurationVo);
        AjaxUtils.jsonforword(configuration, response);
    }
}
