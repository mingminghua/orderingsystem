package com.sourthwind.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Description
 * @auther Ming
 * @create 2021-01-20 18:28
 */
@Data
public class Account {
    private long id;
    private String username;
    private String password;
    private String nickname;
    private String gender;
    private String telephone;
    private Date registerdate;
    private String address;
}