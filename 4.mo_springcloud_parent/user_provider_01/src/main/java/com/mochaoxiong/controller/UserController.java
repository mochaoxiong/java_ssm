package com.mochaoxiong.controller;

import com.mochaoxiong.pojo.User;
import com.mochaoxiong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("user")
    public class UserController {
        @Autowired
        private UserService userService;
        @GetMapping("/{id}")
        public User findById(@PathVariable(name="id") Integer id){
            System.out.println("调用了provider01");
            return userService.findById(id);
        }
    }
