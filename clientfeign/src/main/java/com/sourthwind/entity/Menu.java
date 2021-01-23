package com.sourthwind.entity;

import lombok.Data;

/**
 * @Description
 * @auther Ming
 * @create 2021-01-23 9:24
 */
@Data
public class Menu {
    private long id;
    private String name;
    private double price;
    private String flavor;
    private Type type;
}
