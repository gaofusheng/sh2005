package com.bjpowernode.model.service;

import com.bjpowernode.entity.Students;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.model.service
 * @Description: java类作用描述
 * @Author: 高复生
 * @CreateDate: 2020/12/8 0008 9:04
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public interface StudentsService {

    int delete(Integer stuId);

    int insert(Students record);

    int insertSelective(Students record);

    Students selectByPrimaryKey(Integer stuId);

    List<Students> selectAll();

    int updateByPrimaryKeySelective(Students record);

    int updateByPrimaryKey(Students record);

    List<Students> selectfind();
}
