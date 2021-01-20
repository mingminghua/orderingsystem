package com.sourthwind.repository;

import com.sourthwind.entity.User;

/**
 * @Description
 * @auther Ming
 * @create 2021-01-20 18:29
 */
public interface UserRepository {
    public User login(String username, String password);
}
