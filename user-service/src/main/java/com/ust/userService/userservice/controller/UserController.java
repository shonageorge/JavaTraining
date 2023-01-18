package com.ust.userService.userservice.controller;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ust.userService.userservice.dto.ResponseDto;
import com.ust.userService.userservice.model.User;
import com.ust.userService.userservice.service.UserService;

@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
public class UserController {

	@Autowired
    private UserService userService;

    @PostMapping("/user/add")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User savedUser = userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<ResponseDto> getUser(@PathVariable("id") int userId){
    	ResponseDto response = userService.getUser(userId);
        return ResponseEntity.ok(response);
    }
}

