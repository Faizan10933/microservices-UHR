package com.faizan.UserService.services;

import com.faizan.UserService.entites.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUser();

    User getUser(String userId);
}
