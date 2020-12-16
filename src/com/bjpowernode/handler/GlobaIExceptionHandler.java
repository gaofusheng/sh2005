package com.bjpowernode.handler;

import com.bjpowernode.exception.AgeException;
import com.bjpowernode.exception.NameException;
import com.bjpowernode.exception.UserException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.handler
 * @Description: java类作用描述
 * @Author: 高复生
 * @CreateDate: 2020/12/11 0011 16:04
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@ControllerAdvice
public class GlobaIExceptionHandler {
    @ExceptionHandler(value = NameException.class)
    public ModelAndView doNameException(Exception ex){
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","除了zs其他用户不能访问");
        mv.addObject("ex",ex);
        mv.setViewName("user/error");
          return mv;
    }
    @ExceptionHandler(value = AgeException.class)
    public ModelAndView doAgeException(Exception ex){
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","年龄超过80");
        mv.addObject("ex",ex);
        mv.setViewName("user/ageerror");
        return mv;
    }

    @ExceptionHandler(value = UserException.class)
    public ModelAndView userException(Exception ex){
        ModelAndView mv=new ModelAndView();
        mv.addObject("ex",ex);
        mv.setViewName("users/login");
        return mv;
    }
}
