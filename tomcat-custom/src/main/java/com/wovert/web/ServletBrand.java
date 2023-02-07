package com.wovert.web;

import com.wovert.pojo.Brand;
import com.wovert.service.BrandService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/brands")
public class ServletBrand extends HttpServlet {
    BrandService service = new BrandService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 调用业务层获取所有品牌数据

        List<Brand> brands = service.selectAll();

        // 存储request 域中
        request.setAttribute("brands", brands);

        // 转发到 brand.jsp
        request.getRequestDispatcher("/brand/brands.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
