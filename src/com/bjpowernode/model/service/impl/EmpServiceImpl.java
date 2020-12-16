package com.bjpowernode.model.service.impl;

import com.bjpowernode.entity.Emp;
import com.bjpowernode.model.dao.EmpDao;
import com.bjpowernode.model.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.model.service.impl
 * @Description: java类作用描述
 * @Author: 高复生
 * @CreateDate: 2020/12/8 0008 14:48
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service
public class EmpServiceImpl implements EmpService{
    @Autowired
    private EmpDao empDao;
    @Override
    public List<Emp> emps() {
        return empDao.selectAll();
    }

    @Override
    public Emp select(Integer empno) {
        return empDao.selectByPrimaryKey(empno);
    }

    @Override
    public void add(Emp emp) {
           empDao.insert(emp);
    }

    @Override
    public void update(Emp emp) {
         empDao.updateByPrimaryKey(emp);
    }

    @Override
    public void delete(Integer empno) {
          empDao.deleteByPrimaryKey(empno);
    }
}
