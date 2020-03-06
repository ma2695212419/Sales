package com.example.sales.utils;

import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 王雨
 * @version 1.0
 * @date 2020/2/19 22:41
 * @package com.hangduo.hd.utils
 */
public class AjaxUtils {

    public static void jsonforword(Object obj, HttpServletResponse response){
        String result = JSON.toJSONString(obj);
        response.setContentType("text/json; charset=utf-8" );
        PrintWriter out;
        try {
            out=response.getWriter();
            out.println(result);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
