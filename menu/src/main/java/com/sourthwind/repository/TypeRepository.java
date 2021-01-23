package com.sourthwind.repository;

import com.sourthwind.entity.Type;

import java.util.List;

/**
 * @Description
 * @auther Ming
 * @create 2021-01-23 9:26
 */
public interface TypeRepository {
    public List<Type> findAll();
}