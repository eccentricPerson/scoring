package com.alearner.controller;

import com.alearner.model.mysql.User;
import com.alearner.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mzg on 2018/5/14.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public long addUser(@RequestBody User user){
        logger.info("mysql-client , controller: UserController,method : addUser ,Param :"+user.toString());
        userService.addUser(user);
        //返回插入的主键
        return user.getId();
    }

    @RequestMapping(value = "/getUserById",method = RequestMethod.GET)
    public User getUserById(@RequestParam(value = "id") int id){
        logger.info("mysql-client , controller: UserController,method : getUserById ,Param : id - "+ id);
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/updateUserById",method = RequestMethod.POST)
    public long updateUserById(User user){
        logger.info("mysql-client , controller: UserController,method : addUser ,Param :"+user.toString());
        return userService.updateUserById(user);
    }

}
