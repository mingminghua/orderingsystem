package com.sourthwind.repository;

import com.sourthwind.entity.Admin;

/**
 * @Description
 * @auther Ming
 * @create 2021-01-20 18:30
 */
public interface AdminRepository {
    public Admin login(String username, String password);
}