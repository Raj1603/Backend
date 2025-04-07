package com.SchoolManagementSystem.Backend.Controller;
import com.SchoolManagementSystem.Backend.Model.AdminDTO;
import com.SchoolManagementSystem.Backend.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admins")
@CrossOrigin(origins = "http://127.0.0.1:5500")

public class Admin {
    @Autowired
    private AdminService adminService;
  @GetMapping
  // get all admins
  public ResponseEntity<List<AdminDTO>> getAllUsers() {
      return ResponseEntity.ok(adminService.getAllUsers());
  }
  // Get the specific admin
@GetMapping("/{email}")
    public ResponseEntity<AdminDTO> getAdminByEmail(@PathVariable String email){
      AdminDTO admin = adminService.getAdminByEmailId(email);
      return  admin != null ? ResponseEntity.ok(admin):ResponseEntity.notFound().build();

}


}


