package com.SchoolManagementSystem.Backend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Admin")
public class AdminEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "emailId", nullable = false,unique = true)
    private String emailId;
    @Column(name = "password", nullable = false)
    private String password;

    public AdminEntity() {}

    public AdminEntity(Long id, String name, String emailId, String password) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
