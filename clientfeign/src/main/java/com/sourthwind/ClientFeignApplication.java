package com.sourthwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description
 * @auther Ming
 * @create 2021-01-23 16:24
 */
@SpringBootApplication
@EnableFeignClients
@ServletComponentScan
public class ClientFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientFeignApplication.class,args);
    }
}