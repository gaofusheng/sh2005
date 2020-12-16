package com.bjpowernode.exception;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.exception
 * @Description: java类作用描述
 * @Author: 高复生
 * @CreateDate: 2020/12/11 0011 15:47
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class MyUserException extends Exception {
    public MyUserException() {
        super();
    }

    public MyUserException(String message) {
        super(message);
    }
}
