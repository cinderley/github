package com.cosc224.github.controller;

import com.cosc224.github.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {
    @GetMapping("getUsers")
    public List<User> getUsers() {
        return List.of(new User("", ""));
    }

    @GetMapping("getUser/{}")
    public User getUser(@PathVariable String email) {
        return new User("name", email);
    }
}
