package com.bjpowernode.model.dao;

import com.bjpowernode.entity.User;

public interface UserDao {
    int insert(User record);

    int insertSelective(User record);

    User selectUser(User user);
}