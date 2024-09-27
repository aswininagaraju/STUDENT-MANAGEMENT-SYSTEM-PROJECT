package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
public class EntityService {


@Service


    @Autowired
    private YourEntityRepository repository;

    public List<YourEntity> getAllEntities() {
        return repository.findAll();
    }

    public YourEntity saveEntity(YourEntity entity) {
        return repository.save(entity);
    }

    // Other service methods
}
