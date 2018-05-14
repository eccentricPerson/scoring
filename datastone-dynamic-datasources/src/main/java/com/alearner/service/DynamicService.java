package com.alearner.service;


import com.alearner.model.mysql.Student;
import com.alearner.model.postgresql.Users;

import java.util.List;

/**
 * @description:
 * @author: MZG
 * @create: 2018-04-04 19:27
 **/
public interface DynamicService {
    List<Student> findAllStudent();
    List<Users> findAllUsers();
}
