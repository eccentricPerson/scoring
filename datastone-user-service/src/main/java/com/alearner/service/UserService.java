package com.alearner.service;

import com.alearner.model.mysql.User;

/**
 * @description:
 * @author: MZG
 * @create: 2018-05-14 09:13
 **/
public interface UserService {
    long addUser(User user);
    User getUserById(int id);
    long updateUserById(User user);
}
