package com.wovert.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/resp")
public class ServletResp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setHeader("Content-Type", "text/html");
        response.setContentType("text/html;charset=UTF-8");
        // 相应字符数据

        // 获取字符输出流
        PrintWriter writer = response.getWriter();

        writer.write("<h1>Response你好</h1>");
    }

}
