package com.alearner.service.impl;

import com.alearner.config.DataSources.DataSourceType;
import com.alearner.config.DataSources.MyDataSource;
import com.alearner.model.mysql.Student;
import com.alearner.model.postgresql.Users;
import com.alearner.mappers.mysql.StudentMapper;
import com.alearner.mappers.postgresql.UsersMapper;
import com.alearner.service.DynamicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: MZG
 * @create: 2018-04-04 19:29
 **/

@Service
public class DynamicServiceImpl implements DynamicService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private UsersMapper usersMapper;


    @Override
    @MyDataSource(DataSourceType.Master)
    public List<Student> findAllStudent() {
        return studentMapper.findAll();
    }



    @Override
    @MyDataSource(DataSourceType.Slave)
    public List<Users> findAllUsers() {
        return usersMapper.findAll();
    }
}
