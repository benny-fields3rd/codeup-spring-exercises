package com.codeup.blog.services;

import com.codeup.blog.models.Post;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

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

    public Post singlePost(long id){
        return posts.get((int)id - 1);
    }

    public Post save(Post post){
        post.setId(posts.size() + 1);
        posts.add(post);
        return post;
    }

    public Post edit(Post post) {
        Post pp = posts.get((int) post.getId() - 1);
        pp.setTitle(post.getTitle());
        pp.setBody(post.getBody());
        return pp;
    }

    public void createPosts(){
        Post post1 = new Post( "Switching Careers", "Lorem ipsum dolor sit amet, ludus definiebas est ne, vel integre legimus atomorum eu, verterem adipiscing duo cu.");
        save(post1); // One way to use create method to pass post
        save(new Post("Life of a Programmer", "Lorem ipsum dolor sit amet, ludus definiebas est ne, vel integre legimus atomorum eu, verterem adipiscing duo cu. Duo at malis nominavi oporteat, id per labore dissentiet conclusionemque. Probo lorem soluta mei no, nostrum epicurei singulis te vix. Quo cu esse assum nihil, ei virtute forensibus nec. Eu qui enim sale nulla. Delenit mediocrem eos ei."));
        save(new Post("First Day at Codeup", "Lorem ipsum dolor sit amet, ludus definiebas est ne, vel integre legimus atomorum eu, verterem adipiscing duo cu. Duo at malis nominavi oporteat, id per labore dissentiet conclusionemque. Probo lorem soluta mei no, nostrum epicurei singulis te vix. Quo cu esse assum nihil, ei virtute forensibus nec. Ex sit illum porro conclusionemque, vis iudico signiferumque id, sea postea verterem ut."));
        save(new Post("Selling All of My Video Games", "Lorem ipsum dolor sit amet, ludus definiebas est ne, vel integre legimus atomorum eu, verterem adipiscing duo cu. Duo at malis nominavi oporteat, id per labore dissentiet conclusionemque.  Eu qui enim sale nulla. Delenit mediocrem eos ei. Ex sit illum porro conclusionemque, vis iudico signiferumque id, sea postea verterem ut."));
        save(new Post("Exam Time at Codeup", "Lorem ipsum dolor sit amet, ludus definiebas est ne, vel integre legimus atomorum eu, verterem adipiscing duo cu. Duo at malis nominavi oporteat, id per labore dissentiet conclusionemque. Probo lorem soluta mei no, . Quo cu esse assum nihilc. Eu qui enim sale nulla. Delenit mediocrem eos ei. Ex sit illum porro conclusionemque, vis iudico signiferumque id, sea postea verterem ut."));
        save(new Post("Job Hunting Experience", "Lorem ipsum dolor sit amet, ludus definiebas est ne, vel integre legimus atomorum eu, verterem adipiscing duo cu. Duo at malis nominavi oporteat, id per labore dissentiet conclusionemque. Probo lorem soluta mei no. Eu qui enim sale nulla. Delenit mediocrem eos ei. Ex sit illum porro conclusionemque, vis iudico signiferumque id, sea postea verterem ut."));
    }
}
