package com.SchoolManagementSystem.Backend.Repository;

import com.SchoolManagementSystem.Backend.Entity.TeacherEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherEntity,Long> {
//    Optional<Object> findByEmail(String email);

//    TeacherDTO getTeacherbyEmail(String email);


}
