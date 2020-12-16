package com.bjpowernode.model.service.impl;

import com.bjpowernode.entity.Teacher;
import com.bjpowernode.model.dao.TeacherDao;
import com.bjpowernode.model.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.model.service.impl
 * @Description: java类作用描述
 * @Author: 高复生
 * @CreateDate: 2020/12/10 0010 9:03
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service
public class TeacherSreviceImpl implements TeacherService {
    @Autowired
    private TeacherDao teacherDao;
    @Override
    public List<Teacher> list(Teacher teacher) {
        return teacherDao.selectAll(teacher);
    }

    @Override
    public void save(Teacher teacher) {

        teacherDao.insertSelective(teacher);
    }

    @Override
    public Teacher get(Integer teaId) {
        return teacherDao.selectByPrimaryKey(teaId);
    }

    @Override
    public void update(Teacher teacher) {
        teacherDao.updateByPrimaryKeySelective(teacher);
    }

    @Override
    public void delete(Integer teaId) {
        teacherDao.deleteByPrimaryKey(teaId);
    }

    @Override
    public void deletes(Integer[] teaId) {
        teacherDao.deletes(teaId);
    }

}
