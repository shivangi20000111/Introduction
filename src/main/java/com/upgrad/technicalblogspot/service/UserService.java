package com.upgrad.technicalblogspot.service;

import com.upgrad.technicalblogspot.model.user;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public boolean login(user user){
        if(user.getUsername().equals("admin") && user.getPassword().equals("admin123")){
            return true;
        }else{
            return false;
        }
    }
}
