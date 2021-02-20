package com.upgrad.technicalblogspot.model;

public class user {
    private String username;
    private String password;
    private String fullName;

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullname) {
        this.fullName = fullName;
    }
}
