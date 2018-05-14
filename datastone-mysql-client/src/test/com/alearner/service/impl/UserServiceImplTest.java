package com.alearner.service.impl;

import com.alearner.model.mysql.User;
import com.alearner.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @description:
 * @author: MZG
 * @create: 2018-05-14 11:23
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void addUser() {
    }

    @Test
    public void getUserById() {
        User user = userService.getUserById(2);
        System.err.println(user.toString());
        System.err.println(user.isAbleStatus());
    }

    @Test
    public void updateUserById() {
    }
}