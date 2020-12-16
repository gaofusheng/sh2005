package com.bjpowernode.model.dao;

import com.bjpowernode.entity.Emp;

import java.util.List;

public interface EmpDao {
    int deleteByPrimaryKey(Integer empno);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer empno);

    List<Emp>selectAll();

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}