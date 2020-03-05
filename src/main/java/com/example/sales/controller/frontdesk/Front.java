package com.example.sales.controller.frontdesk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 马泽朋
 * @version 1.0
 * @date 2020/3/4 下午 5:40
 */
@Controller
public class Front {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

}
