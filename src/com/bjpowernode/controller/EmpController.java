package com.bjpowernode.controller;

import com.bjpowernode.entity.Emp;
import com.bjpowernode.model.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.controller
 * @Description: java类作用描述
 * @Author: 高复生
 * @CreateDate: 2020/12/8 0008 15:01
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
@RequestMapping("emp")
public class EmpController  {
    @Autowired
    private EmpService empService;
    @RequestMapping("emplist")
    List<Emp>list(){
        return empService.emps();
    }
    @RequestMapping("empadd")
    void add(){
    }
    @RequestMapping("addemp")
    String addEmp(Emp emp){
        empService.add(emp);
        return "redirect:emplist";
    }
    @RequestMapping("delete")
    String delete(Integer empno){
        empService.delete(empno);
        return "redirect:emplist";
    }
    @RequestMapping("select")
    Emp select(Integer empno){
       return empService.select(empno);
    }
     @RequestMapping("update")
    String update(Emp emp){
        empService.update(emp);
        return "redirect:emplist";
    }

}
