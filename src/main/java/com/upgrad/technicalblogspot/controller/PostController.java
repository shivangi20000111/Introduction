package com.upgrad.technicalblogspot.controller;

import com.upgrad.technicalblogspot.model.Post;
import com.upgrad.technicalblogspot.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class PostController {
    @Autowired
    PostService postService;
    @RequestMapping("/posts")
    public String getUserPost(Model model){
        ArrayList<Post> posts=postService.getAllPosts();
        model.addAttribute("posts",posts);
        return "posts";
    }
    @RequestMapping("/posts/newpost")
    public String newPost(){
        return "posts/create";
    }
    @RequestMapping(value="/posts/create", method= RequestMethod.POST)
    public String createPost(Post newPost){
        newPost.setDate(new Date());
        postService.createPost(newPost);
        return "redirect:/posts";
    }
}
