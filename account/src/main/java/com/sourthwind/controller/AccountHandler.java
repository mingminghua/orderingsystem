package com.sourthwind.controller;

import com.sourthwind.entity.Account;
import com.sourthwind.entity.Admin;
import com.sourthwind.repository.AdminRepository;
import com.sourthwind.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @auther Ming
 * @create 2021-01-20 18:32
 */
@RestController
@RequestMapping("/account")
public class AccountHandler {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/login/{username}/{password}/{type}")
    public Account login(@PathVariable("username") String username, @PathVariable("password") String password, @PathVariable("type") String type){
        Account account = null;
        switch (type){
            case "user":
                account = userRepository.login(username, password);
                break;
            case "admin":
                account = adminRepository.login(username, password);
                break;
        }
        return account;
    }

    @GetMapping("/getAll")
    public List<Account> getAll(){
        List<Account> result = new ArrayList<Account>();
        List<Admin> tempResult = adminRepository.getAll();
        Account account = null;
        for(Admin admin : tempResult){
            account = (Account) admin;
            result.add(account);
        }
        return result;
    }
}