package com.bjpowernode.controller;

import com.bjpowernode.entity.City;
import com.bjpowernode.model.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.controller
 * @Description: java类作用描述
 * @Author: 高复生
 * @CreateDate: 2020/12/16 0016 11:17
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class ObjectController {
    @Autowired
    private CityService cityService;
    @RequestMapping("objectTest02")
    public @ResponseBody
    List<City>objectTest02(){
        return cityService.list();
    }



}
