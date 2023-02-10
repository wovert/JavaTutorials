package com.wovert.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/forward")
public class ServletForword extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("------------forward-----------");
        // 存储数据
        request.setAttribute("msg", "hello");
        // 请求转发
        request.getRequestDispatcher("/helloworld").forward(request, response);
    }
}
