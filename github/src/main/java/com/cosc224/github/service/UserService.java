package com.cosc224.github.service;

import com.cosc224.github.entity.User;
import com.cosc224.github.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepo;
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    public User getUser(String email) {
        return userRepo.findByEmail(email).get();
    }
}
