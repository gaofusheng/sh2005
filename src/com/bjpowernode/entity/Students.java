package com.bjpowernode.entity;

import java.io.Serializable;

/**
 * t_students
 * @author 
 */
public class Students implements Serializable {
    /**
     * 学生id
     */
    private Integer stuId;

    /**
     * 学生姓名
     */
    private String stuName;

    /**
     * 学生性别(0或1）
     */
    private Integer stuSex;

    private Integer teaId;

    /**
     * 学生状态(0 离校，1在校）
     */
    private Integer stuStatus;

    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    private static final long serialVersionUID = 1L;

    public Integer getStuId() {
        return stuId;
    }

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuSex() {
        return stuSex;
    }

    public void setStuSex(Integer stuSex) {
        this.stuSex = stuSex;
    }

    public Integer getStuStatus() {
        return stuStatus;
    }

    public void setStuStatus(Integer stuStatus) {
        this.stuStatus = stuStatus;
    }
}