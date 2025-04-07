package com.SchoolManagementSystem.Backend.Service;


import com.SchoolManagementSystem.Backend.Entity.TeacherEntity;
import com.SchoolManagementSystem.Backend.Model.TeacherDTO;
import com.SchoolManagementSystem.Backend.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

// get all teachers
    public List<TeacherDTO> getAllTeachers(){
        return teacherRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private TeacherDTO convertToDto(TeacherEntity entity) {
        TeacherDTO dto = new TeacherDTO();
        dto.setName(entity.getName());
        dto.setPassword(entity.getPassword());
        dto.setEmail(entity.getEmail());
        dto.setPhone(entity.getPhone());
        dto.setSubject(entity.getSubject());
        return dto;
    }


}
