package com.bjpowernode.controller;

import com.bjpowernode.entity.Teacher;
import com.bjpowernode.model.service.TeacherService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.aspectj.lang.annotation.Around;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.controller
 * @Description: java类作用描述
 * @Author: 高复生
 * @CreateDate: 2020/12/10 0010 9:39
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
@RequestMapping("teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @RequestMapping("teacherlist")
    PageInfo<Teacher>list(Teacher teacher, @RequestParam(defaultValue = "1")Integer no){
           PageHelper.startPage(no,2);
        List<Teacher> teachers = teacherService.list(teacher);
        PageInfo<Teacher>info=new PageInfo<>(teachers);
        return info;
    }
    @RequestMapping("add")
    void add(Teacher teacher,Integer teaId){
          if (teaId!=null){
              Teacher teacherDB = teacherService.get(teaId);
              BeanUtils.copyProperties(teacherDB,teacher);
          }
    }
    @RequestMapping("save")
    String insert(Teacher teacher){
        if (teacher.getTeaId()!=null){
            teacherService.update(teacher);
        }else {
            teacherService.save(teacher);
        }
        return "redirect:teacherlist";
    }
    @RequestMapping("delete")
    String del(Integer teaId){
        teacherService.delete(teaId);
        return "redirect:teacherlist";
    }
    @RequestMapping("deletes")
    String deletes(Integer[]teaIds){
        teacherService.deletes(teaIds);
         return "redirect:teacherlist";
    }


}
