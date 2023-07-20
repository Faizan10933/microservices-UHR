package com.faizan.UserService.repositories;

import com.faizan.UserService.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
