package com.bjpowernode.hand;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.hand
 * @Description: java类作用描述
 * @Author: 高复生
 * @CreateDate: 2020/12/11 0011 21:00
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class handler implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getSession().getAttribute("user1")==null) {
            response.sendRedirect(request.getContextPath()+"/users/login");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
