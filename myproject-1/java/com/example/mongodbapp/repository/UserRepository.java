package com.example.mongodbapp.repository;

import com.example.mongodbapp.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
