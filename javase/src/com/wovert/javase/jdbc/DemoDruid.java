package com.wovert.javase.jdbc;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class DemoDruid {
    public static void main(String[] args) throws Exception {
        // https://github.com/alibaba/druid/
        // 1.导入jar包
        // 2.配置文件

        // 3.加载配置
        Properties prop = new Properties();
        prop.load(new FileInputStream("javase/src/druid.properties"));

        // 4. 获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        // 5. 获取数据库连接 Connection
        Connection connection = dataSource.getConnection();
        System.out.println(connection);


    }
}
