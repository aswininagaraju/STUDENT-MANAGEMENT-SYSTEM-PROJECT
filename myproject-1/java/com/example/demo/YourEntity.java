package com.example.demo;

import org.springframework.*;


@Document(collection = "your_collection_name")
public class YourEntity {
    
    @Id
    private String id;
    private String name; // Example field
    private int age; // Example field

    // Constructors
    public YourEntity() {}

    public YourEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
