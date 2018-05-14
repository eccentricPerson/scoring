package com.alearner.service.impl;

import com.alearner.common.HystrixMethods;
import com.alearner.model.mysql.User;
import com.alearner.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: MZG
 * @create: 2018-05-14 09:14
 **/
@Service
public class UserServiceImpl implements UserService{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "com.alearner.common.HystrixMethods.getLongError")
    public long addUser(User user) {
        String url = "http://mysql-client/user/addUser";
        logger.info("user-service , service层： UserServiceImpl ，method ： addUser ，Param ："+user.toString());
        logger.info("url : "+url);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        HttpEntity<Object> requestEntity = new HttpEntity<Object>(user,headers);
        return restTemplate.exchange(url, HttpMethod.POST, requestEntity, Long.class).getBody();
    }

    @Override
    public User getUserById(int id) {
        String url = "http://mysql-client/user/getUserById?id="+id;
        logger.info("url : "+url);
        return restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<User>() {}).getBody();
    }

    @Override
    public long updateUserById(User user) {
        String url = "http://mysql-client/user/updateUserById";
        logger.info("user-service , service层： UserServiceImpl ，method ： updateUserById ，Param ："+user.toString());
        logger.info("url : "+url);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        HttpEntity<Object> requestEntity = new HttpEntity<Object>(user,headers);
        return restTemplate.exchange(url, HttpMethod.POST, requestEntity, Long.class).getBody();
    }
}
