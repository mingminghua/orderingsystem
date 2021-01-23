package com.sourthwind.repository;

import com.sourthwind.entity.Admin;
import org.apache.ibatis.annotations.Param;

/**
 * @Description
 * @auther Ming
 * @create 2021-01-20 18:30
 */
public interface AdminRepository {
    public Admin login(@Param("username") String username, @Param("password") String password);
}