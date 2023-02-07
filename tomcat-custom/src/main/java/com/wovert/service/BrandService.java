package com.wovert.service;

import com.wovert.mapper.BrandMapper;
import com.wovert.pojo.Brand;
import com.wovert.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * 查询所有品牌
 * @return
 */
public class BrandService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public List<Brand> selectAll() {
        // 获取SqlSession
        SqlSession sqlSession = factory.openSession();
        // 获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        // 调用方法
        List<Brand> brands = mapper.selectAll();

        sqlSession.close();

        return brands;
    }

    /**
     * 添加品牌
     * @param brand
     */
    public void add(Brand brand) {
        // 获取SqlSession
        SqlSession sqlSession = factory.openSession();
        // 获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        // 调用方法
        mapper.add(brand);

        sqlSession.commit();

        sqlSession.close();
    }

    public Brand selectById(int id) {
        // 获取SqlSession
        SqlSession sqlSession = factory.openSession();
        // 获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        // 调用方法
        Brand brand = mapper.selectById(id);

        sqlSession.commit();

        sqlSession.close();
        return brand;
    }

    public void update(Brand brand) {
        // 获取SqlSession
        SqlSession sqlSession = factory.openSession();
        // 获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        // 调用方法
        mapper.update(brand);

        sqlSession.commit();

        sqlSession.close();
    }
}
