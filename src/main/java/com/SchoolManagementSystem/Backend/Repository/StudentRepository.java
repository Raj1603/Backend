package com.SchoolManagementSystem.Backend.Repository;

import com.SchoolManagementSystem.Backend.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity,Long> {

}
