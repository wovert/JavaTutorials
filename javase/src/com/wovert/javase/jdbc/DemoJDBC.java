package com.wovert.javase.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1.注册驱动
//        Class.forName("com.mysql.jdbc.Driver");
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2.获取链接
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, username, password);

        // 3.定义SQL
        String sql = "update user set money = 2000 where id = 1";

        // 4.获取执行SQL对象
        Statement stmt = conn.createStatement();

        // 5. 执行SQL
        int count = stmt.executeUpdate(sql);

        // 6. 处理结果
        System.out.println(count);

        // 7. 释放资源
        stmt.close();
        conn.close();
    }
}
