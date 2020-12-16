package com.bjpowernode.entity;

import java.io.Serializable;

/**
 * user
 * @author 
 */
public class User implements Serializable {
    private String userName;

    private String password;

    private static final long serialVersionUID = 1L;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}