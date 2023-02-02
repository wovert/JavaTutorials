package com.wovert.mybatis.mapper;

import com.wovert.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();
    User selectById(int id);
}
