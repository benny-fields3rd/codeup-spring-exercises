package com.codeup.blog.models;
import com.codeup.blog.Controllers.PostController;
import com.codeup.blog.services.PostService;

import javax.persistence.*;

@Entity
@Table(name = "posts") // Can be left off in order to actually create table
public class Post {
    // Create columns and properties
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 10000)
    private String body;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Post(){}

    public Post( String title, String body ) {
        this.title = title;
        this.body = body;
    }

    public Post( long id, String title, String body){
        this.setId(id);
        this.title = title;
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public void setId( long id ) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle( String title ) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody( String body ) {
        this.body = body;
    }

    public void setUser( User user ) {
    }
}
