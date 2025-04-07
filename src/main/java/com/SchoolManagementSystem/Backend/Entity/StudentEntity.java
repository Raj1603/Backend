package com.SchoolManagementSystem.Backend.Entity;

import jakarta.persistence.*;

@Entity
public class StudentEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false,unique = true)
    private String email;
//    @Id
 @Column(name = "class_id", columnDefinition = "INT AUTO_INCREMENT")
  private Long classId;

    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "password", nullable = false)
    private String password;

    public StudentEntity() {
    }
    public StudentEntity(Long id, String name, String email, Long classId, String phone, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.classId = classId;
        this.phone = phone;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
