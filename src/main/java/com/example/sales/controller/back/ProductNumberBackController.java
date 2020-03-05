package com.example.sales.controller.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 王雨
 * @version 1.0
 * @date 2020/3/5 20:59
 * @package com.example.sales.controller.back
 */
@Controller
@RequestMapping("/back")
public class ProductNumberBackController {
    @RequestMapping("/toProductNumber")
    public String toProductChain() {
        return "back-product-number-management";
    }
}
