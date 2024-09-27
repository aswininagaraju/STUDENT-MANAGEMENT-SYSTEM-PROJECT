package com.example.repository;


import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {
    User findByEmail(String email);

    // Add your custom query methods here
    List<User> findByLastName(String lastName);

    @Qualifier("SELECT u FROM User u WHERE u.age >= ?1")
    List<User> findUsersOlderThan(int age);
}


