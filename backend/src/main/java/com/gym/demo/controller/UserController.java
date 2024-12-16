package com.gym.demo.controller;

import com.gym.demo.DTO.UserDTO;
import com.gym.demo.model.User;
import com.gym.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/{userId}")
    public UserDTO getUserById(@PathVariable String userId) {
        return userService.getUserById(userId);
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/follow")
    public ResponseEntity<Object> followUser(@RequestParam String userId, @RequestParam String FollowedUserId) {
        return userService.followUser(userId,FollowedUserId);
    }
    @PostMapping("/login")
    public ResponseEntity<Object> loginUser(@RequestBody User user) {

        return userService.loginUser(user.getEmail(), user.getPassword());

    }
}

