package com.sourthwind;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @auther Ming
 * @create 2021-01-20 18:26
 */
@SpringBootApplication
@MapperScan("com.sourthwind.repository")
public class AccountApplication {

    public static void main(String[] args) {
            SpringApplication.run(AccountApplication.class,args);
        }

}
