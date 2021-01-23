package com.sourthwind;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @auther Ming
 * @create 2021-01-23 14:44
 */
@SpringBootApplication
@MapperScan("com.sourthwind.repository")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}