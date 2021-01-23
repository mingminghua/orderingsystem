package com.sourthwind.repository;

import com.sourthwind.entity.Menu;

import java.util.List;

/**
 * @Description
 * @auther Ming
 * @create 2021-01-23 9:25
 */
public interface MenuRepository {
    public List<Menu> findAll(int index, int limit);
    public int count();
    public void save(Menu menu);
    public Menu findById(long id);
    public void update(Menu menu);
    public void deleteById(long id);
}