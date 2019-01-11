package com.codeup.blog.services;

import com.codeup.blog.interfaces.PostRepository;
import com.codeup.blog.models.Post;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    private  List<Post> posts;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> allPosts() {
        return (List<Post>) postRepository.findAll();
    }

    public Post singlePost(long id){
        return postRepository.findOne(id);
    }

    public Post save(Post post){
        return postRepository.save(post);
    }

    public void delete(Post post){
        postRepository.delete(post);
    }


}
