package com.bjpowernode.model.service;

import com.bjpowernode.entity.City;
import com.bjpowernode.model.dao.CityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.model.service
 * @Description: java类作用描述
 * @Author: 高复生
 * @CreateDate: 2020/12/7 0007 16:16
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;
    @Override
    public List<City> list() {
        return cityDao.selectAll();
    }
}
