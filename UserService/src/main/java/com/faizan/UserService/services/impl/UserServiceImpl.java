package com.faizan.UserService.services.impl;

import com.faizan.UserService.entites.User;
import com.faizan.UserService.exceptions.ResourceNotFoundException;
import com.faizan.UserService.repositories.UserRepository;
import com.faizan.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        String userRandomId= UUID.randomUUID().toString();

        user.setId(userRandomId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server !! : " + userId));
    }
}
