package com.wovert.web;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@WebServlet("/http")
public class  ServerletHttp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        System.out.println("-----------------请求行---------------");

        // 设置编码

        String method = req.getMethod();
        String contextPath = req.getContextPath(); // 虚拟目录（项目访问路径）
        String reqUrl = String.valueOf(req.getRequestURL()); // URL
        String reqUri = req.getRequestURI(); // URI
        String queryString = req.getQueryString();
        String username = req.getParameter("username");

        // URL编码
        String encodeVal = URLEncoder.encode("张三", "utf-8");
        System.out.println(encodeVal);

        // URL解码
//        String decodeVal = URLDecoder.decode(encodeVal, "utf-8");
        String decodeVal = URLDecoder.decode(encodeVal, "ISO-8859-1");
        System.out.println(decodeVal);

        // 转换为字节数据(tomcat 内部机制)
        byte[] bytes = decodeVal.getBytes("ISO-8859-1");
        for(byte b: bytes) {
            System.out.print(b + "\t");
        }
        System.out.println();
        // 将字节数组转为字符串
        String s = new String(bytes, "utf-8");
        System.out.println("s=" + s);
        System.out.println("-------------------------------");

//        byte[] bytes2 = username.getBytes(StandardCharsets.ISO_8859_1);
//        username = new String(bytes2, StandardCharsets.UTF_8);
        username = new String(username.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        System.out.println("-------------------------------");


        System.out.println("method=" + method);
        System.out.println("contextPath=" + contextPath);
        System.out.println("reqUrl=" + reqUrl);
        System.out.println("reqUri=" + reqUri);
        System.out.println("queryString=" + queryString);
        System.out.println("username=" + username);

        System.out.println("----------------请求头--------------");
        System.out.println(req.getHeader("User-Agent"));


        Map<String, String[]> map = req.getParameterMap();
        for(String key : map.keySet()) {
            String[] values = map.get(key);
            System.out.print(key + "=");
            for(String value: values) {
                System.out.print(value + "\t");
            }
        }
        System.out.println();
        String[] hobbys = req.getParameterValues("hobby");
        System.out.print("hobby=");
        for(String value: hobbys) {
            System.out.print(value + "\t");
        }
        System.out.println();
        System.out.println(req.getParameter("username"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        System.out.println("----------------请求体--------------");


        // 字节输入流
//        ServletInputStream sis = req.getInputStream();

        // 字符输入流
//        BufferedReader br = req.getReader();
//
//        // 读取数据
//        String line = br.readLine();
//        System.out.println(line);


        Map<String, String[]> map = req.getParameterMap();
        for(String key : map.keySet()) {
            String[] values = map.get(key);
            System.out.print(key + "=");
            for(String value: values) {
                System.out.print(value + "\t");
            }
        }
        System.out.println();
        String[] hobbys = req.getParameterValues("hobby");
        System.out.print("hobby=");
        for(String value: hobbys) {
            System.out.print(value + "\t");
        }
        System.out.println();
        System.out.println(req.getParameter("username"));
    }
}
