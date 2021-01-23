package com.sourthwind.repository;

import com.sourthwind.entity.Admin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description
 * @auther Ming
 * @create 2021-01-20 18:30
 */
public interface AdminRepository {
    /**
     * 测试ADMIN登陆功能,实际为select
     * @param username
     * @param password
     * @return
     */
    public Admin login(@Param("username") String username, @Param("password") String password);

    public Admin getOne(@Param("id") Long id);

    @Select("SELECT * FROM t_admin")
    @Results({
            @Result(property = "username",  column = "username"),
            @Result(property = "password", column = "password")
    })
    List<Admin> getAll();
}