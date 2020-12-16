package com.bjpowernode.model.dao;

import com.bjpowernode.entity.Students;

import java.util.List;

public interface StudentsDao {
    int deleteByPrimaryKey(Integer stuId);

    int insert(Students record);

    int insertSelective(Students record);

    Students selectByPrimaryKey(Integer stuId);

    List<Students> selectAll();

    int updateByPrimaryKeySelective(Students record);

    int updateByPrimaryKey(Students record);
    List<Students> selectfind();
}