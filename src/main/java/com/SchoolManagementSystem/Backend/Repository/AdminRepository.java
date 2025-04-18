package com.SchoolManagementSystem.Backend.Repository;

import com.SchoolManagementSystem.Backend.Entity.AdminEntity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<AdminEntity,String> {

    Optional<Object> findByEmailId(String email);

}

