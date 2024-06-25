package com.schedule.votation.service;

import com.schedule.votation.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserEntity getUser(){
        UserEntity user = new UserEntity();
        user.setId(1L);
        user.setName("Gustavo");
        return user;
    }
}
