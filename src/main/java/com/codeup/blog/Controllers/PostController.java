package com.codeup.blog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class PostController {

    @GetMapping("/posts")
    public String posts(){
        return "This is the posts index page!";
    }

    @GetMapping("/posts/{id}")
    public String indyPost( @PathVariable long id ){
        return "Views an individual post from id number: " + id + ".";
    }

    @GetMapping("/posts/create")
    public String createPostForm(){
        return "This is the form for creating posts!";
    }

    @PostMapping("/posts/create")
    public String  createPost(){
        return "This creates a new post!";
    }
}
