package com.bjpowernode.exception;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.exception
 * @Description: java类作用描述
 * @Author: 高复生
 * @CreateDate: 2020/12/13 0013 16:30
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class UserException extends MyUserException {
    public UserException() {
        super();
    }

    public UserException(String message) {
        super(message);
    }
}
