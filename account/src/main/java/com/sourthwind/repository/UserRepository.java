package com.sourthwind.repository;

import com.sourthwind.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author Adminstrator
 * @Description
 * @auther Ming
 * @create 2021-01-20 18:29
 */
public interface UserRepository {
    public User login(@Param("username") String username, @Param("password") String password);
}
