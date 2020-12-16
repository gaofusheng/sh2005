package com.bjpowernode.controller;

import com.bjpowernode.entity.User;
import com.bjpowernode.exception.UserException;
import com.bjpowernode.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.controller
 * @Description: java类作用描述
 * @Author: 高复生
 * @CreateDate: 2020/12/13 0013 16:17
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
@RequestMapping("users")
public class ControllerUser {
    @Autowired
    private UserService userService;
    @RequestMapping("login")
    void login(){

    }
    @RequestMapping("select")
    public ModelAndView get(User user, HttpSession session) throws UserException {
        ModelAndView mv=new ModelAndView();
        User user1 = userService.getUser(user);
        if (user1==null){
           throw new UserException("用户名或密码错误请重新");
        }
        session.setAttribute("user1",user1);
        mv.addObject("user",user1);
        mv.setViewName("users/user");
        return mv;

    }
}
