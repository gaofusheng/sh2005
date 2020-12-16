package com.bjpowernode.controller;

import com.bjpowernode.entity.City;
import com.bjpowernode.model.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.controller
 * @Description: java类作用描述
 * @Author: 高复生
 * @CreateDate: 2020/12/7 0007 16:17
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class CityController {
    @Autowired
    private CityService cityService;
    @RequestMapping("list")
    List<City>list(){
        return cityService.list();
    }
}
