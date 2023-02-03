package com.wovert.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


/**
 * Servlet 有Tomcat服务器创建，Servlet方法也有Tomcat服务器调用
 */
@WebServlet(urlPatterns = "/helloworld", loadOnStartup = 1) // 精确匹配
//@WebServlet(urlPatterns = {"/helloworld", "/hi"}, loadOnStartup = 1) // 多次匹配
//@WebServlet(urlPatterns = {"/helloworld/*", "/hi/*"}, loadOnStartup = 1) // 目录匹配
//@WebServlet(urlPatterns = "*.do", loadOnStartup = 1) // 扩展名匹配
//@WebServlet(urlPatterns = "/", loadOnStartup = 1) // 任意匹配: 匹配任意访问瑞金
//@WebServlet(urlPatterns = "/*", loadOnStartup = 1) // 任意匹配：覆盖tomcat的DefaultServlet，当其他的url-pattern都匹配不上的时候会走这个Servlet

// 使用任意匹配规则时，不能再访问静态资源文件
public class ServletHelloWorld implements Servlet {

    private ServletConfig config;
    /**
     * 初始化方法
     * 1. 调用时机：默认轻盔昂下，Server被第一次访问时调用
     *  loadOnStartup
     * 2. 调用次数：1次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
        System.out.println("helloworld init...");
    }

    /**
     * 提供服务
     * 1. 调用时机：每一次Servlet被访问时调用
     * 2. 调用次数：多次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello World Servlet!");
        Object msg = servletRequest.getAttribute("msg");
        System.out.println("msg=" + msg);
    }

    /**
     * 销毁方法
     * 调用时机：内存释放或服务器关闭的时候，Serve论坛对象会被销毁调用
     * 调用次数：1次
     */
    @Override
    public void destroy() {
        System.out.println("helloworld destroy...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }



    @Override
    public String getServletInfo() {
        return null;
    }


}
