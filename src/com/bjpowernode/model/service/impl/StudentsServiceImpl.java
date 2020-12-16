package com.bjpowernode.model.service.impl;

import com.bjpowernode.entity.Students;
import com.bjpowernode.model.dao.StudentsDao;
import com.bjpowernode.model.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.model.service.impl
 * @Description: java类作用描述
 * @Author: 高复生
 * @CreateDate: 2020/12/8 0008 9:05
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service
public class StudentsServiceImpl implements StudentsService {
    @Autowired
    private StudentsDao studentsDao;
    @Override
    public int delete(Integer stuId) {

        return studentsDao.deleteByPrimaryKey(stuId);
    }

    @Override
    public int insert(Students record) {
        return studentsDao.insert(record);
    }
    @Override
    public int insertSelective(Students record) {
        return 0;
    }

    @Override
    public Students selectByPrimaryKey(Integer stuId) {

        return studentsDao.selectByPrimaryKey(stuId);
    }

    @Override
    public List<Students> selectAll() {

        return studentsDao.selectAll();
    }

    @Override
    public int updateByPrimaryKeySelective(Students record) {
        return studentsDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Students record) {
        return studentsDao.updateByPrimaryKey(record);
    }

    @Override
    public List<Students> selectfind() {
        return studentsDao.selectfind();
    }
}
