package com.sourthwind.controller;

import com.sourthwind.entity.User;
import com.sourthwind.entity.UserVO;
import com.sourthwind.feign.OrderFeign;
import com.sourthwind.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @auther Ming
 * @create 2021-01-23 16:37
 */
@Controller
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserFeign userFeign;
    @Autowired
    private OrderFeign orderFeign;

    @GetMapping("/findAll")
    @ResponseBody
    public UserVO findAll(@RequestParam("page") int page, @RequestParam("limit") int limit){
        return userFeign.findAll(page, limit);
    }

    @PostMapping("/save")
    public String save(User user){
        userFeign.save(user);
        return "redirect:/account/redirect/user_manage";
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long id){
        orderFeign.deleteByUid(id);
        userFeign.deleteById(id);
        return "redirect:/account/redirect/user_manage";
    }
}