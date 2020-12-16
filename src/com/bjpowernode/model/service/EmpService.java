package com.bjpowernode.model.service;

import com.bjpowernode.entity.Emp;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.model.service
 * @Description: java类作用描述
 * @Author: 高复生
 * @CreateDate: 2020/12/8 0008 14:47
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public interface EmpService {
    List<Emp>emps();

    Emp select(Integer empno);

    void add(Emp emp);

    void update(Emp emp);

    void delete(Integer empno);
}
