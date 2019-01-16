package com.codeup.blog.Controllers;

import com.codeup.blog.interfaces.UserRepository;
import com.codeup.blog.models.Post;
import com.codeup.blog.models.User;
import com.codeup.blog.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private final PostService postService;
    private final UserRepository userRepository;


    public PostController( PostService postService, UserRepository userRepository ) {
        this.postService = postService;
        this.userRepository= userRepository;
        // setting user before creating post
//        User user = userRepository.findOne(1L);
//        Post post = new Post();
//        post.setTitle("Apple Macbook Pro 15 inch");
//        post.setBody("Macbook Pro for sale! Excellent condition!");
//        post.setUser(user);
//        postService.save(post);
    }

    @GetMapping("/posts")
    public String allPosts(Model model){
        model.addAttribute("posts", postService.allPosts());
        System.out.println("There are " + userRepository.count() + "users.");
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String singlePost( @PathVariable long id, Model model ){
        model.addAttribute("post",postService.singlePost(id)); // pass id for single post
        model.addAttribute("id", id);
        model.addAttribute("user", postService.singlePost(id).getUser() );
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String createPostForm(Model model){
        model.addAttribute("post",new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String saveNewPost(@ModelAttribute Post post){
        long randomUser = (long) Math.floor(Math.random() * userRepository.count() + 1);
        post.setUser(userRepository.findOne(randomUser));
        postService.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String editPostForm(@PathVariable long id, Model model){
        model.addAttribute("post", postService.singlePost(id));
        return "posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String saveEditedPost(@ModelAttribute Post post){
        postService.save(post);
        return "redirect:/posts/" + post.getId();
    }

    @GetMapping("/posts/{id}/delete")
    public String showDeleteForm(@PathVariable long id, Model model){
        model.addAttribute("post", postService.singlePost(id));
        return "posts/delete";
    }

    @PostMapping("/posts/{id}/delete")
    public String deletePost(@ModelAttribute Post post){
        postService.delete(post);
        return "redirect:/posts";
    }



}
