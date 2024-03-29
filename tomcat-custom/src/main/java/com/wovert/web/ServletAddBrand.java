package com.wovert.web;

import com.alibaba.fastjson.JSON;
import com.wovert.pojo.Brand;
import com.wovert.pojo.Person;
import com.wovert.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/addbrand")
public class ServletAddBrand extends HttpServlet {
    BrandService service = new BrandService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        // 调用业务层获取所有品牌数据
        String brandName = request.getParameter("brand_name");
        String companyName = request.getParameter("company_name");
        String ordered = request.getParameter("ordered");
        String description = request.getParameter("description");
        String status = request.getParameter("status");

        // json to java
        Person person = JSON.parseObject(description, Person.class);
        System.out.println("Person=" + person);

        // json to java
        String jsonstr = JSON.toJSONString(person);
        System.out.println(jsonstr);


        /**
         * 获取请求体数据
         * BufferReader br = request.getReader();
         * String params = br.readLine();
         * Brand brand = JSON.parseObject(params, Brand.class);
         */

        Brand brand = new Brand();
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setOrdered(Integer.parseInt(ordered));
        brand.setDescription(description);
        brand.setStatus(Integer.parseInt(status));

        service.add(brand);

        request.getRequestDispatcher("/brands").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
