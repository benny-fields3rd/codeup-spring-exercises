package com.codeup.blog.Controllers;

import bean.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String allPosts(Model model){
        List<Post> allPosts = new ArrayList<>();
        Post post1 = new Post("My array Post1", "Body of this post1!");
        Post post2 = new Post("My array2 Post2", "Body of this post2!");
        allPosts.add(post1);
        allPosts.add(post2);
        model.addAttribute("posts", allPosts);
        return "/posts/index";
    }

    @GetMapping("/posts/{id}")
    public String singlePost( @PathVariable long id, Model model ){
        Post post = new Post("My First Post", "Body of this post!");
        model.addAttribute("post",post);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String createPostForm(){
        return "This is the form for creating posts!";
    }

    @PostMapping("/posts/create")
    public String  submitPost(){
        return "This creates a new post!";
    }
}
