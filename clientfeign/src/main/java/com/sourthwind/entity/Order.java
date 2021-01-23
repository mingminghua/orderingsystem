package com.sourthwind.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Description
 * @auther Ming
 * @create 2021-01-23 12:26
 */
@Data
public class Order {
    private long id;
    private User user;
    private Menu menu;
    private Admin admin;
    private Date date;
    private int state;
}