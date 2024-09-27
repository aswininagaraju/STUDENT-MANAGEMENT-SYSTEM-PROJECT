
package com.example.service;


import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

 @Autowired
 private StudentRepository studentRepository;

 public String enrollStudent(Student student) {
     Optional<Student> existingStudent = studentRepository.findByNameAndEmail(student.getName(), student.getEmail());
     if (existingStudent.isPresent()) {
         return "already enrolled"; // Student already exists
     } else {
         studentRepository.save(student);
         return "success"; // New student added
     }
 }
}
