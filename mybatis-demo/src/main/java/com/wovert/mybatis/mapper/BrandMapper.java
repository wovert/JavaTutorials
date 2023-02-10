package com.wovert.mybatis.mapper;

import com.wovert.mybatis.pojo.Brand;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
    // 查询所有
    List<Brand> selectAll();

    // 查看详情
    Brand selectById(int id);

    @Select("select * from tb_brand where id = #{id}")
    Brand selectById2(int id);

    // 多条件查询
//    List<Brand> selectByMultiCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);

//    List<Brand> selectByMultiCondition(Brand brand);

    // 多个条件动态查询
    List<Brand> selectByMultiCondition(Map map);

    // 单个条件动态查询
    List<Brand> selectBySingleCondition(Brand brand);

    // 添加数据
    void add(Brand brand);

    // 全部修改
    int updateAll(Brand brand);

    // 修改部分
    int update(Brand brand);

    // 单个删除
    void deleteById(int id);

    // 批量删除
    void deleteByIds(@Param("ids") int[] ids);




}
