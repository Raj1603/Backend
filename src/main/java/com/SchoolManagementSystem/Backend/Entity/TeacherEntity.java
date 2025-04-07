package com.SchoolManagementSystem.Backend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Teacher")
public class TeacherEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "subject", nullable = false)
    private String subject;

    @Column(name = "email", nullable = false,unique = true)
    private String email;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "password", nullable = false)
    private String password;

    public TeacherEntity() {
    }


    public TeacherEntity(Long id, String name, String subject, String email, String phone, String password) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
