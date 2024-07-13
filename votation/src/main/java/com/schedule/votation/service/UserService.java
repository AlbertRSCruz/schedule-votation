package com.schedule.votation.service;

import com.schedule.votation.entity.UserEntity;
import com.schedule.votation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserEntity createUser(UserEntity user){
        return userRepository.save(user);
    }
    public UserEntity getUser(Long id){
        var user=userRepository.findById(id);
        if (user.isEmpty()){
            throw new RuntimeException("Usuario não encontrado");
        }else{
            return user.get();
        }
    }
    public void deleteUser(Long id){
        var user=userRepository.findById(id);
        if (user.isEmpty()){
            throw new RuntimeException("Usuario não encontrado");
        }else {
            userRepository.deleteById(id);
        }
    }
}

