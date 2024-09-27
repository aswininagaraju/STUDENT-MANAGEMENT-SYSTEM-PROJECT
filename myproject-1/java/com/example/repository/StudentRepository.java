
package com.example.repository;

import com.example.demo.*;
import org.springframework.*;

import java.util.Optional;



public interface StudentRepository extends MongoRepository<YourEntity, String> {
    // Define custom query methods here
}
