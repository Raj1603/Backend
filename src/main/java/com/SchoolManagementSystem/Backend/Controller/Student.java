package com.SchoolManagementSystem.Backend.Controller;

import com.SchoolManagementSystem.Backend.Model.StudentDTO;

import com.SchoolManagementSystem.Backend.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/students")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class Student {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentDTO>> getAllStudents(){
        return ResponseEntity.ok(studentService.getAllStudents());
    }
}
