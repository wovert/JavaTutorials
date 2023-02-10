package com.wovert.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/demogetsession")
public class ServletGetSession extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        // 获取session
        // 服务器重启后，Session 中的数据是否还在？
        // 钝化：在服务器正常关闭后，tomcat 会自动将 Session 数据写入硬盘的文件中
        // 活化：再次启动服务器后，从文件中加载数据到 Session 中


        // 销毁方式
        // 默认，30分钟无操作自动销毁
        // 设置方法
        /**
         * <session-config>
         *     <session-timeout>30</session-timeout>
         * </session-config>
         */

        // 销毁
//        session.invalidate();


        Object username = session.getAttribute("username");
        System.out.println(username);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
