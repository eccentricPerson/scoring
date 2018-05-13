package com.alearner.service;

import com.alearner.model.mysql.User;

/**
 * Created by mzg on 2018/5/14.
 */
public interface UserService {
    long addUser(User user);
    User getUserById(int id);
    long updateUserById(User user);
}
