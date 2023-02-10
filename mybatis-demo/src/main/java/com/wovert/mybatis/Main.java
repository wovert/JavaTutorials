package com.wovert.mybatis;

import com.wovert.mybatis.mapper.BrandMapper;
import com.wovert.mybatis.mapper.UserMapper;
import com.wovert.mybatis.pojo.Brand;
import com.wovert.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static SqlSessionFactory sqlSessionFactory;
    private static SqlSession sqlSession;
    private static BrandMapper brandMapper;

    static {
        // 静态代码块随着类的加载而自动执行，且只执行一次
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            // false: 手动提交事务， true: 自动提交事务
            sqlSession = sqlSessionFactory.openSession(false);

            brandMapper = sqlSession.getMapper(BrandMapper.class);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        // 1.加载 mytabis 的核心配置文件 获取 SqlSessionFactory
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2.获取Sqlsession对象，用来其执行 SQL
//        sqlSession = sqlSessionFactory.openSession();
//        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 3.执行SQL
//        List<User> users = sqlSession.selectList("test.selectAll");

        // 获取接口代理对象
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users = userMapper.selectAll();
//        System.out.println(users);

//        selectAll();
        selectById();
//        selectMultiCondition();
//        selectSingleCondition();
//        addData();
//        updateAll();
//        update();
//        deleteById();
//        deleteByIds();
        sqlSession.close();
    }

    private static void deleteByIds() {
        int[] ids = {9, 10};
        // 返回影响行数
        brandMapper.deleteByIds(ids);
        sqlSession.commit(); // 提交事务
    }
    private static void deleteById() {
        int id = 8;
        // 返回影响行数
        brandMapper.deleteById(id);
        sqlSession.commit(); // 提交事务
    }

    private static void updateAll() {
        int id = 8;
        int status = 0;
        String companyName = "Adidas股份公司";
        String brandName = "Adidas 阿迪达斯-德国";
        int ordered = 198;
        String description = "阿迪达斯 专注体育品牌...";
        Brand brand = new Brand();
        brand.setId(id);
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setStatus(status);
        brand.setDescription(description);
        brand.setOrdered(ordered);

        // 返回影响行数
        System.out.println(brandMapper.updateAll(brand));
        sqlSession.commit(); // 提交事务
    }

    private static void update() {
        int id = 8;
        int status = 1;
        String companyName = "Adidas股份公司";
        String brandName = "Adidas 阿迪达斯-德国";
        int ordered = 198;
        String description = "阿迪达斯 专注体育品牌...";
        Brand brand = new Brand();
        brand.setId(id);
//        brand.setBrandName(brandName);
//        brand.setCompanyName(companyName);
        brand.setStatus(status);
//        brand.setDescription(description);
//        brand.setOrdered(ordered);

        // 返回影响行数
        System.out.println(brandMapper.update(brand));
        sqlSession.commit(); // 提交事务
    }

    private static void addData() {
        int status = 1;
        String companyName = "Adidas公司";
        String brandName = "阿迪达斯-德国";
        int ordered = 200;
        String description = "阿迪达斯 专注体育品牌";
        Brand brand = new Brand();
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setStatus(status);
        brand.setDescription(description);
        brand.setOrdered(ordered);
        brandMapper.add(brand);
        System.out.println(brand.getId()); // null
        sqlSession.commit(); // 提交事务

    }

    /**
     * 多条件查询
     */
    private static void selectMultiCondition() {
        int status = 1;
        String companyName = "%公司%";
        String brandName = "%中国%";
        // 参数方式
//        List<Brand> brands = brandMapper.selectByMultiCondition(status, companyName, brandName);

        // map方式
//        Map map = new HashMap();
////        map.put("status", status);
//        map.put("companyName", companyName);
//        map.put("brandName", brandName);
//        List<Brand> brands = brandMapper.selectByMultiCondition(map);

        // brand对象方式
        Brand brand = new Brand();
//        brand.setBrandName(brandName);
//        brand.setCompanyName(companyName);
        brand.setStatus(status);
        List<Brand> brands = brandMapper.selectBySingleCondition(brand);


        System.out.println(brands);
    }

    /**
     * 多条件查询
     */
    private static void selectSingleCondition() {
        int status = 1;
        String companyName = "%公司%";
        String brandName = "%中国%";
        Brand brand = new Brand();
//        brand.setBrandName(brandName);
//        brand.setCompanyName(companyName);
        brand.setStatus(status);
        List<Brand> brands = brandMapper.selectBySingleCondition(brand);

        System.out.println(brands);
    }

    /**
     * 查看详情
     */
    private static void selectById() {
        int id = 2;
//        Brand brand = brandMapper.selectById(id);
        Brand brand = brandMapper.selectById2(id);
        System.out.println(brand);
    }

    /**
     * 查询所有数据
     */
    private static void selectAll() {
        List<Brand> brands = brandMapper.selectAll();
        System.out.println(brands);
    }
}