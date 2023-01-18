package com.ust.userService.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.userService.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
