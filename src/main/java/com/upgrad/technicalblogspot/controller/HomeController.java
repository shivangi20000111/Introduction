package com.upgrad.technicalblogspot.controller;

import com.upgrad.technicalblogspot.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
@Controller
public class HomeController {
    @RequestMapping("/")
    //just a random comment for this line
    public String getAllPosts(Model model){
        ArrayList<Post> posts=new ArrayList<>();

        Post post1=new Post();
        post1.setTitle("Mirzapur");
        post1.setBody("Kalim Bhai ki sarkar");
        post1.setDate(new Date());

        Post post2=new Post();
        post2.setTitle("Gangs of Wassepur");
        post2.setBody("Kah Ke Lelenge");
        post2.setDate(new Date());

        Post post3=new Post();
        post3.setTitle("Kisan");
        post3.setBody("Modi ki sarkar");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        model.addAttribute("posts",posts);
        return "index";
    }
}
