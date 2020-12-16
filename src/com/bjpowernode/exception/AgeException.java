package com.bjpowernode.exception;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.exception
 * @Description: java类作用描述
 * @Author: 高复生
 * @CreateDate: 2020/12/11 0011 15:48
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class AgeException extends MyUserException {
    public AgeException() {
        super();
    }

    public AgeException(String message) {
        super(message);
    }
}
