package com.wovert.javase.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.wovert.javase.jdbc.javabean.User;

public class DemoResultSet {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1.注册驱动
//        Class.forName("com.mysql.jdbc.Driver");
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2.获取链接
        String dburl = "jdbc:mysql://127.0.0.1:3306/test";
        String dbusername = "root";
        String dbpassword = "root";
        Connection conn = DriverManager.getConnection(dburl, dbusername, dbpassword);

        // 3.定义SQL
        String sql = "select * from user";

        // 4.获取执行SQL对象
        Statement stmt = conn.createStatement();

        List<User> list = new ArrayList<>();

        // 5. 执行SQL
        ResultSet query = stmt.executeQuery(sql);
        while(query.next()) {
//            int id = query.getInt(1);
//            String username = query.getString(2);
//            String password = query.getString(3);
//            double money = query.getDouble(4);

            int id = query.getInt("id");
            String username = query.getString("username");
            String password = query.getString("password");
            double money = query.getDouble("money");

//            System.out.println("id=" + id);
//            System.out.println("username=" +  username);
//            System.out.println("password=" + password);
//            System.out.println("money=" + money);
            User user = new User();
            user.setId(id);
            user.setUsername(username);
            user.setPassword(password);
            user.setMoney(money);

            list.add(user);

        }
        System.out.println(list);
        // 7. 释放资源
        stmt.close();
        conn.close();
    }
}
