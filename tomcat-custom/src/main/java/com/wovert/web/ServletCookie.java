package com.wovert.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet("/democookie")
public class ServletCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        // 发送cookie
//        Cookie cookie = new Cookie("username", "zhangsan");
        // cookie 不能直接存储中文, URL 编码S
        String val = "张三";

        // 中文需要 URL 编码
        val = URLEncoder.encode(val, "utf-8");

        // Cookie 最大3KB
        Cookie cookie = new Cookie("username", val);
        cookie.setMaxAge(60*60*24*7); // second 7 days 负数：默认值，当前浏览器内存中，关闭则被销毁， 0：删除对应 Cookie
        response.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
