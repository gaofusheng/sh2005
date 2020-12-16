package com.bjpowernode.entity;

import java.io.Serializable;

/**
 * t_teacher
 * @author 
 */
public class Teacher implements Serializable {
    private Integer teaId;

    private String teaName;

    private Integer teaAge;

    private String teaSex;
    private String teadate;
    private Integer teaAgeEnd;
    private String teadateEnd;
    public String getTeadate() {
        return teadate;
    }

    public void setTeadate(String teadate) {
        this.teadate = teadate;
    }

    public Integer getTeaAgeEnd() {
        return teaAgeEnd;
    }

    public void setTeaAgeEnd(Integer teaAgeEnd) {
        this.teaAgeEnd = teaAgeEnd;
    }

    public String getTeadateEnd() {
        return teadateEnd;
    }

    public void setTeadateEnd(String teadateEnd) {
        this.teadateEnd = teadateEnd;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private static final long serialVersionUID = 1L;

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public Integer getTeaAge() {
        return teaAge;
    }

    public void setTeaAge(Integer teaAge) {
        this.teaAge = teaAge;
    }

    public String getTeaSex() {
        return teaSex;
    }

    public void setTeaSex(String teaSex) {
        this.teaSex = teaSex;
    }
}