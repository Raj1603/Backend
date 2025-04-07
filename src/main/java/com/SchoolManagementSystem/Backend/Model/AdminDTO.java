package com.SchoolManagementSystem.Backend.Model;

public class AdminDTO {
    private String name;
    private String emailId;
    private String password;
// constructor
    public AdminDTO(){}
    public AdminDTO(String name, String emailId, String password) {
        this.name = name;
        this.emailId = emailId;
        this.password = password;
    }

    // getter and setters

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}


    public String getEmailId(){return emailId;}
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public void setPassword(String password){this.password= password;}
    public  String getPassword(){
        return password;
    }
}
