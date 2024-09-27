package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
public class EntityController {



@RestController
@RequestMapping("/api/entities")

    @Autowired
    private YourEntityService service;

    @GetMapping
    public List<YourEntity> getAllEntities() {
        return service.getAllEntities();
    }

    @PostMapping
    public YourEntity saveEntity(@RequestBody YourEntity entity) {
        return service.saveEntity(entity);
    }
}

