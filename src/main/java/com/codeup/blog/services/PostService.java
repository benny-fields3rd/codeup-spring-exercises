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
        createPosts();
    }

    public List<Post> allPosts() {
        return posts;
    }

    public Post save(Post post){
        post.setId(posts.size() + 1);
        posts.add(post);
        return post;
    }

    public Post singlePost(long id){
        return posts.get((int)id - 1);
    }

    public Post edit(Post post) {
        Post pp = posts.get((int) post.getId() - 1);
        pp.setTitle(post.getTitle());
        pp.setBody(post.getBody());
        return pp;
    }

    public void createPosts(){
        Post post1 = new Post( "Post 1", "body 1");

        save(post1); // One way to use create method to pass post
        save(new Post( "Post 2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi tristique lacus eget tortor commodo pretium. Nullam nisl ligula, sollicitudin eget venenatis eget, venenatis ac neque. Maecenas vestibulum arcu vel vulputate eleifend. Maecenas pharetra libero nec velit suscipit imperdiet. In blandit porttitor justo, ac finibus neque vulputate eget. Maecenas hendrerit imperdiet purus dapibus pretium. Aliquam faucibus ex eget auctor accumsan. Suspendisse a erat sed augue pharetra rhoncus. Proin quis massa odio. Donec nec mollis ante. Sed molestie pellentesque est, malesuada fermentum ante luctus eu. Nulla viverra dapibus nunc, vel hendrerit est facilisis sed. Nulla pellentesque tempor lacus sit amet consectetur. Suspendisse sagittis feugiat justo.\n" +
                "\n"));
        save(new Post("Post 3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi tristique lacus eget tortor commodo pretium. Nullam nisl ligula, sollicitudin eget venenatis eget, venenatis ac neque. Maecenas vestibulum arcu vel vulputate eleifend. Maecenas pharetra libero nec velit suscipit imperdiet. In blandit porttitor justo, ac finibus neque vulputate eget. Maecenas hendrerit imperdiet purus dapibus pretium. Aliquam faucibus ex eget auctor accumsan. Suspendisse a erat sed augue pharetra rhoncus. Proin quis massa odio. Donec nec mollis ante. Sed molestie pellentesque est, malesuada fermentum ante luctus eu. Nulla viverra dapibus nunc, vel hendrerit est facilisis sed. Nulla pellentesque tempor lacus sit amet consectetur. Suspendisse sagittis feugiat justo.\n" +
                "\n")); // another way to do it
        save(new Post("Post 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi tristique lacus eget tortor commodo pretium. Nullam nisl ligula, sollicitudin eget venenatis eget, venenatis ac neque. Maecenas vestibulum arcu vel vulputate eleifend. Maecenas pharetra libero nec velit suscipit imperdiet. In blandit porttitor justo, ac finibus neque vulputate eget. Maecenas hendrerit imperdiet purus dapibus pretium. Aliquam faucibus ex eget auctor accumsan. Suspendisse a erat sed augue pharetra rhoncus. Proin quis massa odio. Donec nec mollis ante. Sed molestie pellentesque est, malesuada fermentum ante luctus eu. Nulla viverra dapibus nunc, vel hendrerit est facilisis sed. Nulla pellentesque tempor lacus sit amet consectetur. Suspendisse sagittis feugiat justo.\n" +
                "\n"));
        save(new Post("Post 5", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi tristique lacus eget tortor commodo pretium. Nullam nisl ligula, sollicitudin eget venenatis eget, venenatis ac neque. Maecenas vestibulum arcu vel vulputate eleifend. Maecenas pharetra libero nec velit suscipit imperdiet. In blandit porttitor justo, ac finibus neque vulputate eget. Maecenas hendrerit imperdiet purus dapibus pretium. Aliquam faucibus ex eget auctor accumsan. Suspendisse a erat sed augue pharetra rhoncus. Proin quis massa odio. Donec nec mollis ante. Sed molestie pellentesque est, malesuada fermentum ante luctus eu. Nulla viverra dapibus nunc, vel hendrerit est facilisis sed. Nulla pellentesque tempor lacus sit amet consectetur. Suspendisse sagittis feugiat justo.\n" +
                "\n"));
    }
}
