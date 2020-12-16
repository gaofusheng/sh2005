package com.bjpowernode.controller;

import com.bjpowernode.exception.AgeException;
import com.bjpowernode.exception.NameException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.controller
 * @Description: java类作用描述
 * @Author: 高复生
 * @CreateDate: 2020/12/11 0011 15:26
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("dosome")
    public ModelAndView dosome(String name,Integer age) throws Exception{
        System.out.println("我是dome方法");
        ModelAndView mv=new ModelAndView();
        if (!"zs".equals(name)){
            throw new NameException("姓名不正确");
        }
        if (age==null ||age>80){
            throw  new AgeException("年龄太大了");
        }
        System.out.println(name+age);
        mv.addObject("name",name);
        mv.addObject("age",age);
        mv.setViewName("/user/dosome");
           return mv;
    }

}
