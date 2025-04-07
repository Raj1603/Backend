package com.SchoolManagementSystem.Backend.Model;

public class StudentDTO {
    private String name;
    private String email;
    private Long classId;
    private String phone;
    private String password;

    // constructor
    public StudentDTO() {
    }

    public StudentDTO(String name, String email, Long classId, String phone, String password) {
        this.name = name;
        this.email = email;
        this.classId = classId;
        this.phone = phone;
        this.password = password;
    }

    // getter and setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
