package com.example.sales.controller.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 王雨
 * @version 1.0
 * @date 2020/3/5 20:58
 * @package com.example.sales.controller.back
 */
@Controller
@RequestMapping("/back")
public class ProductTypeBackController {
    @RequestMapping("/toProductType")
    public String toProductChain() {
        return "back-product-type-management";
    }
}
