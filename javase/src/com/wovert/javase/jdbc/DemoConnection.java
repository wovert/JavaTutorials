package com.wovert.javase.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoConnection {
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
        String sql1 = "update user set money = 10000 where id = 1";
        String sql2 = "update user set money = 20000 where id = 2";

        // 4.获取执行SQL对象
        Statement stmt = conn.createStatement();

        try {
            // 开启事务
            conn.setAutoCommit(false);

            // 5. 执行SQL
            int count1 = stmt.executeUpdate(sql1);
            // 6. 处理结果
            System.out.println(count1);

//            int i = 3/0;

            int count2 = stmt.executeUpdate(sql2);
            System.out.println(count2);
            // 提交事务
            conn.commit();
        } catch (SQLException e) {
            // 回滚事务
            conn.rollback();
            throw new RuntimeException(e);
        } finally {
            // 7. 释放资源
            stmt.close();
            conn.close();
        }
    }
}
