package com.wovert.web;

import com.wovert.pojo.Brand;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/jstl")
public class ServerletJstl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        System.out.println("-----------------请求行---------------");
        List<Brand> brands = new ArrayList<Brand>();
        brands.add(new Brand(101, "LV", "LV Company", 100, "LV Desc", 1));
        brands.add(new Brand(102, "News", "News Company", 101, "News Desc", 0));
        brands.add(new Brand(103, "Nick", "Nick Company", 102, "Nick Desc", 1));



        req.setAttribute("brands", brands);
        req.setAttribute("status", true);

        req.getRequestDispatcher("/jstl.jsp").forward(req, resp);

    }
}
