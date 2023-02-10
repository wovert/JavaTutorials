package com.wovert.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


/**
 * 拦截资源路径
 * /index.jsp: 只有访问index.jsp时才会被拦截
 * /user/*: 访问/user下的所有资源，都会被拦截
 * *.jsp: 访问后缀名为 jsp 的资源，都会被拦截
 * /*: 访问所有资源，都会被拦截
 *
 * 按照类名自然排序
 */
@WebFilter("/*")
public class DemoFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FilterDemo ...");

        // 放行
        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("放行后执行 ...");
    }

    @Override
    public void destroy() {

    }
}
