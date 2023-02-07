package com.wovert.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@WebServlet("/redirect")
public class ServerletRedirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        System.out.println("-----------------请求行---------------");

//        resp.setStatus(302);
//        resp.setHeader("Location", "/tomcat-custom/helloworld");

        // 动态获取虚拟目录
        resp.sendRedirect(req.getContextPath()+ "/helloworld");

    }
}
