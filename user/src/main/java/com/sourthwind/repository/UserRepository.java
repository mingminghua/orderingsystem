package com.sourthwind.repository;

import com.sourthwind.entity.User;

import java.util.List;

/**
 * @Description
 * @auther Ming
 * @create 2021-01-23 14:51
 */
public interface UserRepository {
    public List<User> findAll(int index, int limit);
    public int count();
    public void save(User user);
    public void deleteById(long id);
}
