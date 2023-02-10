package com.wovert.javase.jdbc;

import java.sql.*;

public class DemoPreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1.注册驱动
//        Class.forName("com.mysql.jdbc.Driver");
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2.获取链接
        // 预编译开启：useServerPrepStmts=true
        /**
         * mysql.ini
         * log-output=FILE
         * general-log=1
         * general_log_file="D:\mysqld.log"
         * slow-query-log=1
         * slow_query_log_file="D:\mysql_slow.log"
         * long_query_time=2
         */
        String dburl = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&useServerPrepStmts=true";
        String dbusername = "root";
        String dbpassword = "root";
        Connection conn = DriverManager.getConnection(dburl, dbusername, dbpassword);


        String usernameVal = "admin";
//        String passwordVal = "123456";
        String passwordVal = "' or '1' = '1";

        // 3.定义SQL
//        String sql = "select * from user where username='" + usernameVal + "' and password='" + passwordVal + "'";
//        System.out.println(sql);
        String sql = "select * from user where username=? and password=?";

        // 4.获取执行SQL对象
//        Statement stmt = conn.createStatement();
        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, usernameVal);
        pstm.setString(2, passwordVal); // 自动转移 ' = \'

        // 5. 执行SQL
        ResultSet query = pstm.executeQuery();
        if(query.next()) {
            System.out.println("登录成功!");
        } else {
            System.out.println("登录失败!");
        }

        // 7. 释放资源
        pstm.close();
        conn.close();
    }
}
