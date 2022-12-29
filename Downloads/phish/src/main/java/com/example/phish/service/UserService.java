package com.example.phish.service;

import com.example.phish.entity.User;
import com.example.phish.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void save(User user) {

        userRepository.save(user);
    }
}
