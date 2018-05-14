package com.alearner;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by mzg on 2018/5/14.
 */
@EnableSwagger2
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.alearner.mappers")
public class MysqlClientApplication {
    public static void main(String [] args){
        SpringApplication.run(MysqlClientApplication.class,args);
    }
}
