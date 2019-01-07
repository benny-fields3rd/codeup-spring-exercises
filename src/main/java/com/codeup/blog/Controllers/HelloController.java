package com.codeup.blog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    // passing name as file path
    @ResponseBody
    @GetMapping("/hello/{name}")
    public String hello( @PathVariable String name ){
        return "Howdy, " + name + "!";
    }
    // passing first and last names
    @ResponseBody
    @GetMapping("/hello/{first}/{last}")
    public String hello( @PathVariable String first, @PathVariable String last ){
        return "Howdy, " + first + " " + last + "!";
    }
    // For just path to hello
    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "Howdy, you! So good to run into you!";
    }
}
