package com.sourthwind.entity;

import lombok.Data;

import java.util.List;

/**
 * @Description
 * @auther Ming
 * @create 2021-01-23 12:26
 */
@Data
public class OrderVO {
    private int code;
    private String msg;
    private int count;
    private List<Order> data;
}