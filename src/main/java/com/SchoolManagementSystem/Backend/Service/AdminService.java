package com.SchoolManagementSystem.Backend.Service;

import com.SchoolManagementSystem.Backend.Entity.AdminEntity;
import com.SchoolManagementSystem.Backend.Model.AdminDTO;
import com.SchoolManagementSystem.Backend.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;
    //  Get all admins
    public List<AdminDTO> getAllUsers() {
        return adminRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private AdminDTO convertToDto(AdminEntity entity) {
        AdminDTO dto = new AdminDTO();
        dto.setName(entity.getName());
        dto.setEmailId(entity.getEmailId());
         dto.setPassword(entity.getPassword()); // Consider removing
        return dto;
    }
    //  Get the specific users
    public AdminDTO getAdminByEmailId(String email){
        AdminEntity admin = (AdminEntity) adminRepository.findByEmailId(email).orElse(null);
        if (admin != null){
            AdminDTO dto = new AdminDTO();
            dto.setEmailId(admin.getEmailId());
            dto.setName(admin.getName());
            dto.setPassword(admin.getPassword());
            return dto;
        }
        return null;
    }



}