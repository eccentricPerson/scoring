package com.alearner.service.impl;

import com.alearner.mappers.UserMapper;
import com.alearner.model.mysql.User;
import com.alearner.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mzg on 2018/5/14.
 */
@Service
public class UserServiceImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserMapper userMapper;

    @Override
    public long addUser(User user) {
        logger.info("Mysql Table : user ,method : addUser  ,param : " + user.toString() );
        return userMapper.addUser(user);
    }

    @Override
    public User getUserById(int id) {
        logger.info("Mysql Table : user ,method : getUserById  ,param :  id - " + id );
        return userMapper.getUserById(id);
    }

    @Override
    public long updateUserById(User user) {
        logger.info("Mysql Table : user ,method : addUser  ,param : " + user.toString() );
        return userMapper.updateUserById(user);
    }
}
