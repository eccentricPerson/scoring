package com.alearner.controller;

import com.alearner.model.mysql.Student;
import com.alearner.model.postgresql.Users;
import com.alearner.service.DynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: MZG
 * @create: 2018-04-04 19:35
 **/

@RestController
@RequestMapping(value = "/dynamic",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DynamicController {

    @Autowired
    private DynamicService dynamicService;


    @RequestMapping(value = "/getAllStudent")
    public List<Student>  getAllStudent(){
        return dynamicService.findAllStudent();
    }

    @RequestMapping(value = "/getAllUsers")
    public List<Users> getAllUsers(){
        return dynamicService.findAllUsers();
    }

}
