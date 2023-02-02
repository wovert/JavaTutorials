package com.wovert.mybatis;

import com.wovert.mybatis.mapper.UserMapper;
import com.wovert.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1.加载 mytabis 的核心配置文件 获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2.获取Sqlsession对象，用来其执行 SQL
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3.执行SQL
//        List<User> users = sqlSession.selectList("test.selectAll");

        // 获取接口代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectAll();
//        //
        System.out.println(users);

        sqlSession.close();
    }
}