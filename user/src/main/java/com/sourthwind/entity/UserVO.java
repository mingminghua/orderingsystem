package com.sourthwind.entity;

import lombok.Data;

import java.util.List;

/**
 * @Description
 * @auther Ming
 * @create 2021-01-23 14:50
 */
@Data
public class UserVO {
    private int code;
    private String msg;
    private int count;
    private List<User> data;
}
