package com.SchoolManagementSystem.Backend.Service;

import com.SchoolManagementSystem.Backend.Entity.StudentEntity;
import com.SchoolManagementSystem.Backend.Model.StudentDTO;
import com.SchoolManagementSystem.Backend.Model.TeacherDTO;
import com.SchoolManagementSystem.Backend.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    // get all students
    public List<StudentDTO> getAllStudents(){
        return studentRepository.findAll().stream()
                .map(this::convertToDTO).collect(Collectors.toList());
    }
    private StudentDTO convertToDTO (StudentEntity entity){
        StudentDTO dto = new StudentDTO();
        dto.setName(entity.getName());
        dto.setPassword(entity.getPassword());
        dto.setEmail(entity.getEmail());
        dto.setPhone(entity.getPhone());
//        dto.setSubject(entity.getSubject());
        return dto;
    }
}
