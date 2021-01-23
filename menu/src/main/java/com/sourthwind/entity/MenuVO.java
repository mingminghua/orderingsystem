package com.sourthwind.entity;

import lombok.Data;

import java.util.List;

/**
 * @Description
 * @auther Ming
 * @create 2021-01-23 9:25
 */
@Data
public class MenuVO {
    private int code;
    private String msg;
    private int count;
    private List<Menu> data;
}
