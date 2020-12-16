package com.bjpowernode.model.dao;

import com.bjpowernode.entity.Teacher;

import java.util.List;

public interface TeacherDao {
    int deleteByPrimaryKey(Integer teaId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer teaId);

    List<Teacher>selectAll(Teacher teacher);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    int deletes(Integer[]teaId);
}