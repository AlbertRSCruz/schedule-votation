package com.schedule.votation.controller;

import com.schedule.votation.entity.UserEntity;
import com.schedule.votation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")

public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
     public UserEntity teste(){
         return userService.getUser();
     }
}
