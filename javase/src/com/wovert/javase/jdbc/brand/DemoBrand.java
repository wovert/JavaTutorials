package com.wovert.javase.jdbc.brand;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.wovert.javase.jdbc.brand.javabean.Brand;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DemoBrand {
    public static void main(String[] args) throws Exception {
        /*
         create table tb_brand(
            id int primary key auto_increment,
            brand_name varchar(20),
            company_name varchar(20),
            ordered int,
            description varchar(100),
            status int
         );
         insert into tb_brand(brand_name, company_name, ordered, description, status)
         values('三只松鼠', '三只松鼠股份有限公司', 5, '好吃不上火', 0),
               ('华为', '华为技术有限公司', 100, '华为致力于把数字世界带入每个人、每个家庭、每个组织，构建万物互联的之智能世界', 1),
               ('小米', '小米科技有限公司', 50, '世界最实惠的产品', 1);
         */
//        testSelectAll();
//        testAdd();
//        testUpdate();
        testDelete();

    }

    private static void testDelete() throws Exception {
        // 获取Connection
        Properties prop = new Properties();
        prop.load(new FileInputStream("javase/src/druid.properties"));

        // 4. 获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        // 5. 获取数据库连接 Connection
        Connection conn = dataSource.getConnection();

        // 接受参数
        int id = 4;

        // SQL
        String sql = "delete from tb_brand where id=?";

        // 获取对象
        PreparedStatement pstmt = conn.prepareStatement(sql);

        // 设置参数
        pstmt.setInt(1, id);

        // 执行sql
        int count = pstmt.executeUpdate();

        if (count > 0) {
            System.out.println("删除成功！");
        } else {
            System.out.println("删除失败!");
        }

        // 释放资源
        pstmt.close();
        conn.close();
    }

    private static void testUpdate() throws Exception {
        // 获取Connection
        Properties prop = new Properties();
        prop.load(new FileInputStream("javase/src/druid.properties"));

        // 4. 获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        // 5. 获取数据库连接 Connection
        Connection conn = dataSource.getConnection();

        // 接受参数
        String brandName = "香奈儿V8";
        int ordered = 1;
        String description = "奢侈品品牌";
        int status = 1;
        int id = 4;

        // SQL
        String sql = "update tb_brand set brand_name=? where id=?";

        // 获取对象
        PreparedStatement pstmt = conn.prepareStatement(sql);

        // 设置参数
        pstmt.setString(1, brandName);
        pstmt.setInt(2, id);

        // 执行sql
        int count = pstmt.executeUpdate();

        if (count > 0) {
            System.out.println("修改成功！");
        } else {
            System.out.println("修改失败!");
        }

        // 释放资源
        pstmt.close();
        conn.close();
    }

    /**
     * 添加
     * 参数：除了ID之外的所有参数
     * 结果：boolean
     */
    private static void testAdd() throws Exception {
        // 获取Connection
        Properties prop = new Properties();
        prop.load(new FileInputStream("javase/src/druid.properties"));

        // 4. 获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        // 5. 获取数据库连接 Connection
        Connection conn = dataSource.getConnection();

        // 接受参数
        String brandName = "香奈儿";
        String companyName = "LV股份有限公司";
        int ordered = 1;
        String description = "奢侈品品牌";
        int status = 1;

        // SQL
        String sql = "insert into tb_brand(brand_name, company_name, ordered, description, status)" +
                " values(?, ?, ?, ?, ?)";

        // 获取对象
        PreparedStatement pstmt = conn.prepareStatement(sql);

        // 设置参数
        pstmt.setString(1, brandName);
        pstmt.setString(2, companyName);
        pstmt.setInt(3, ordered);
        pstmt.setString(4, description);
        pstmt.setInt(5, status);

        // 执行sql
        int count = pstmt.executeUpdate();

        if (count > 0) {
            System.out.println("添加成功！");
        } else {
            System.out.println("添加失败!");
        }

        // 释放资源
        pstmt.close();
        conn.close();
    }

    /**
     * 查询所有
     * SQL: select * from tb_brand;
     * 参数：不需要
     * 结果：List<Brand>
     */
    public static void testSelectAll() throws Exception {
         // 获取Connection
        Properties prop = new Properties();
        prop.load(new FileInputStream("javase/src/druid.properties"));

        // 4. 获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        // 5. 获取数据库连接 Connection
        Connection conn = dataSource.getConnection();

        // SQL
        String sql = "select * from tb_brand";

        // 获取pstmt对象
        PreparedStatement pstmt = conn.prepareStatement(sql);

        // 设置参数

        // 执行SQL
        ResultSet rs = pstmt.executeQuery();

        Brand brand = null;
        List<Brand> brands = new ArrayList<>();

        // 处理结果
        while(rs.next()) {
            // 获取数据
            int id = rs.getInt("id");
            String brand_name = rs.getString("brand_name");
            String company_name = rs.getString("company_name");
            int ordered = rs.getInt("ordered");
            String description = rs.getString("description");
            int status = rs.getInt("status");
            // 封装Brand对象
            brand = new Brand();
            brand.setId(id);
            brand.setBrandName(brand_name);
            brand.setCompanyName(company_name);
            brand.setOrdered(ordered);
            brand.setDescription(description);
            brand.setStatus(status);

            // 装载集合
            brands.add(brand);
        }

        System.out.println(brands);

        // 释放资源
        rs.close();
        pstmt.close();
        conn.close();
    }
}
