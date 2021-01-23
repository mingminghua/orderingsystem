package com.sourthwind.repository;

import com.sourthwind.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description
 * @auther Ming
 * @create 2021-01-23 14:51
 */
public interface UserRepository {
    public List<User> findAll(@Param("index") int index, @Param("limit") int limit);
    public int count();
    public void save(@Param("user") User user);
    public void deleteById(@Param("id") long id);
}
