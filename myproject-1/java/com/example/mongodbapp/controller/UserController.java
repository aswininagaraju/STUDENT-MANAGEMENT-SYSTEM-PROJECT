package com.example.mongodbapp.controller;

import com.example.mongodbapp.model.User;
import com.example.mongodbapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Create a new user (POST request)
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // Get all users (GET request)
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get a user by ID (GET request)
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable String id) {
        return userRepository.findById(id);
    }

    // Update a user (PUT request)
    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User updatedUser) {
        return userRepository.findById(id).map(user -> {
            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());
            return userRepository.save(user);
        }).orElseGet(() -> {
            updatedUser.setId(id);
            return userRepository.save(updatedUser);
        });
    }

    // Delete a user (DELETE request)
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userRepository.deleteById(id);
    }
}
