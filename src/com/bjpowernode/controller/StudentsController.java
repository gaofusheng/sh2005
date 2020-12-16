package com.bjpowernode.controller;

import com.bjpowernode.entity.Students;
import com.bjpowernode.entity.Teacher;
import com.bjpowernode.model.service.StudentsService;
import com.bjpowernode.model.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.controller
 * @Description: java类作用描述
 * @Author: 高复生
 * @CreateDate: 2020/12/8 0008 9:13
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
@RequestMapping("students")//命名空间
public class StudentsController {
    @Autowired//注入
    private StudentsService studentsService;
    @Autowired
    private TeacherService teacherService;
    @RequestMapping("list")//action
    List<Students> list(){//studentsList
        return studentsService.selectfind();//请求作用域的值 约定前缀+命名空间加+action.后缀
    }
    @RequestMapping("add")
    List<Teacher> add(Teacher teacher){
        return teacherService.list(teacher);
    }
    @RequestMapping("save")
    String save(Students students){
        studentsService.insert(students);
        return "redirect:list";
    }
    @RequestMapping("delete")
    String delete(Integer stuId){
        studentsService.delete(stuId);
        return "redirect:list";
    }
    @RequestMapping("select")
    public ModelAndView getStundetsAndTeacher(Teacher teacher,Integer stuId){
        ModelAndView mv=new ModelAndView();
        List<Teacher> teachers = teacherService.list(teacher);
        Students students = studentsService.selectByPrimaryKey(stuId);
        mv.addObject("list",teachers);
        mv.addObject("students",students);
        mv.setViewName("students/select");
        return mv;
    }
    @RequestMapping("update")
    String update(Students students){
        studentsService.updateByPrimaryKey(students);
        return "redirect:list";
    }

}
