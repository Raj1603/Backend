package com.SchoolManagementSystem.Backend.Controller;

import com.SchoolManagementSystem.Backend.Entity.TeacherEntity;
import com.SchoolManagementSystem.Backend.Model.AdminDTO;
import com.SchoolManagementSystem.Backend.Model.TeacherDTO;
import com.SchoolManagementSystem.Backend.Repository.TeacherRepository;
import com.SchoolManagementSystem.Backend.Service.AdminService;
import com.SchoolManagementSystem.Backend.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teacher")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class Teacher {
    @Autowired
    private TeacherService teacherService;
    @GetMapping
    public ResponseEntity<List<TeacherDTO>> getAllTeachers(){
        return ResponseEntity.ok(teacherService.getAllTeachers());
    }
//
//    @GetMapping("/email/{email}")
//    public ResponseEntity<TeacherDTO> getTeacherbyEmail(@PathVariable String email){
//        TeacherDTO teacher = teacherRepository.getTeacherbyEmail(email);
//        return teacher!=null ? ResponseEntity.ok(teacher):ResponseEntity.notFound().build();
//    }
}