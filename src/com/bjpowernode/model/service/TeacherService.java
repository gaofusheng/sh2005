package com.bjpowernode.model.service;

import com.bjpowernode.entity.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.model.service
 * @Description: java类作用描述
 * @Author: 高复生
 * @CreateDate: 2020/12/10 0010 9:01
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public interface TeacherService {
    List<Teacher>list(Teacher teacher);

    void save(Teacher teacher);

    Teacher get(Integer teaId);

    void update(Teacher teacher);

    void delete(Integer teaId);

    void deletes(Integer[]teaId);



}
