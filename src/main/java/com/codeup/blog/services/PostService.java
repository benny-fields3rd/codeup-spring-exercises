package com.codeup.blog.services;

import com.codeup.blog.models.Post;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

// Create a PostService class and inject it into your posts controller. The service should keep an array
// list of posts internally, and have methods for:
//
// finding a post (retrieving an individual post object)
// retrieving all the posts

@Service
public class PostService {
    private  List<Post> posts;

    public PostService() {
        posts = new ArrayList<>();
        createPost();
    }

    public List<Post> allPosts() {
        return posts;
    }

    public Post create(Post post){
        post.setId(posts.size() + 1);
        posts.add(post);
        return post;
    }

    public Post singlePost(long id){
        return posts.get((int)id - 1);
    }

    public void createPost(){
        Post post1 = new Post( "Post 1", "body 1");

        create(post1); // One way to use create method to pass post
        create(new Post( "Post 2", "body 2"));
        create(new Post("Post 3", "Body 3")); // another way to do it
        create(new Post("Post 4", "Body 4"));
        create(new Post("Post 5", "Body 5"));
    }
}
