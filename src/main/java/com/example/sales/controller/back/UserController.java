package com.example.sales.controller.back;

import com.example.sales.model.entity.User;
import com.example.sales.service.back.UserService;
import com.example.sales.utils.AjaxUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.math.BigInteger;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2020/3/8 15:05
 * @package com.example.sales.controller.back
 */

@Controller
@RequestMapping("/back/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/init")
    public String init(Model model) {
        List<User> allUser = userService.getAllUser();
        model.addAttribute("allUser", allUser);
        return "back-users-management";
    }

    @PostMapping("/add")
    public void add(User user, HttpServletResponse response) {
        boolean b = userService.insertSelective(user);
        AjaxUtils.jsonforword(b, response);
    }

    @PostMapping("/upd")
    public void upd(User user, HttpServletResponse response) {
        boolean b = false;
        if (user.getUid() != null && user.getUid() != ""
                && user.getUpassword() != null && user.getUpassword() != "") {
            b = userService.updateByPrimaryKeySelective(user);
        }
        AjaxUtils.jsonforword(b, response);
    }

}
