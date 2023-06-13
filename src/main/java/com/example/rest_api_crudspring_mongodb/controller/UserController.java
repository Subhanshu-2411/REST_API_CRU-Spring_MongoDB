package com.example.rest_api_crudspring_mongodb.controller;

import com.example.rest_api_crudspring_mongodb.model.User;
import com.example.rest_api_crudspring_mongodb.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userService.getUser(id);
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping("{id}")
    public User updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        user.setPhoneNo(id);
        return userService.updateUser(user);
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }
}
