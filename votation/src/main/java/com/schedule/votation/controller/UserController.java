package com.schedule.votation.controller;

import com.schedule.votation.entity.ScheduleEntity;
import com.schedule.votation.entity.UserEntity;
import com.schedule.votation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public UserEntity getUser(@PathVariable Long id) {
        return userService.getUser(id);

    }
    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity user){
        return userService.createUser(user);
    }
    @DeleteMapping("/{id}")
    public void deleteSchedule(@PathVariable Long id){
        userService.deleteUser(id);
    }
}

