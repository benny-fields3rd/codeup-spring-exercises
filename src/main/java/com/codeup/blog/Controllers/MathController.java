package com.codeup.blog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MathController {

    @GetMapping("/add/{num1}/and/{num2}")
    public double add( @PathVariable double num1, @PathVariable double num2){
        return num1 + num2;
    }

    @GetMapping("/subtract/{num1}/and/{num2}")
    public double subtract( @PathVariable double num1, @PathVariable double num2){
        return num1 - num2;
    }

    @GetMapping("/multiply/{num1}/and/{num2}")
    public double multiply( @PathVariable double num1, @PathVariable double num2){
        return num1 * num2;
    }

    @GetMapping("/divide/{num1}/and/{num2}")
    public double divide( @PathVariable double num1, @PathVariable double num2){
        return num1 / num2;
    }


}
