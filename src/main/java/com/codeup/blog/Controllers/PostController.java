package com.codeup.blog.Controllers;

import com.codeup.blog.models.Post;
import com.codeup.blog.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    private final PostService postService;

    public PostController( PostService postService ) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public String allPosts(Model model){
        model.addAttribute("posts", postService.allPosts());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String singlePost( @PathVariable long id, Model model ){
        model.addAttribute("post",postService.singlePost(id)); // pass id for single post
        model.addAttribute("id", id);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String createPostForm(Model model){
        model.addAttribute("post",new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String save(@ModelAttribute Post post){
        postService.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String editPostForm(@PathVariable Long id, Model model){
        model.addAttribute("post", postService.singlePost(id));
        return "posts/edit";
    }

    @PostMapping("/posts/edit")
    public String saveEditedPost(@ModelAttribute Post post){
        postService.edit(post);
        return "redirect:/posts" + post.getId();
    }
}
