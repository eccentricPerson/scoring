package com.alearner.controller;

import com.alearner.model.common.ReturnT;
import com.alearner.model.mysql.User;
import com.alearner.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: MZG
 * @create: 2018-05-14 09:31
 **/
@RestController
@RequestMapping(value = "/user",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@CrossOrigin
public class UserController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public ReturnT<Long> addUser(@RequestBody User user){
        logger.info("user-service , UserController , addUser ,Param : user"+user.toString());
        return new ReturnT(userService.addUser(user));
    }

    @RequestMapping(value = "/getUserById",method = RequestMethod.GET)
    public ReturnT<User> getUserById(@RequestParam(value = "id") int id){
        logger.info("user-service , UserController , getUserById ,Param : id - "+id);
        return new ReturnT(userService.getUserById(id));
    }

    @RequestMapping(value = "/updateUserById",method = RequestMethod.POST)
    public ReturnT<Long> updateUserById(@RequestBody User user){
        logger.info("user-service , UserController , addUser ,Param : user"+user.toString());
        return new ReturnT(userService.updateUserById(user));
    }


}
