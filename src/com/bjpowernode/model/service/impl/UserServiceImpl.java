package com.bjpowernode.model.service.impl;

import com.bjpowernode.entity.User;
import com.bjpowernode.model.dao.UserDao;
import com.bjpowernode.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.model.service.impl
 * @Description: java类作用描述
 * @Author: 高复生
 * @CreateDate: 2020/12/13 0013 16:14
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User getUser(User user) {

        return userDao.selectUser(user);
    }
}
