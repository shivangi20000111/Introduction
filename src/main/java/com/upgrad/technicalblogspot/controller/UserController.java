package com.upgrad.technicalblogspot.controller;


import com.upgrad.technicalblogspot.model.Post;
import com.upgrad.technicalblogspot.model.user;
import com.upgrad.technicalblogspot.service.PostService;
import com.upgrad.technicalblogspot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private PostService postservice;

    @RequestMapping("users/login")
    public String login(Model model){
        model.addAttribute("user", new user());
        return "users/login";
    }
    @RequestMapping(value="users/login",method= RequestMethod.POST)
    public String loginUser(user user){
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        if(userService.login(user)){
            return "redirect:/posts";
        }else{
            return  "users/login";
        }
    }
    @RequestMapping("users/registration")
    public String registration(){
        return "users/registration";
    }
    @RequestMapping(value="users/registration",method=RequestMethod.POST)
    public String registerUser(user user){
        System.out.println(user.getFullName());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return "redirect:/users/login";
    }
    @RequestMapping(value="users/logout",method=RequestMethod.POST)
    public String logout(){
        return "index";
    }
}
