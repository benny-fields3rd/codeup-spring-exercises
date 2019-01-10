package com.codeup.blog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DiceController {

    @GetMapping("/roll-dice")
    public String dice(){
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")
    public String dice(@PathVariable int n, Model model) {
        int dieRoll = (int) Math.floor(Math.random() * 6) + 1;

        model.addAttribute("dieRoll", dieRoll);
        model.addAttribute("guess", n);
        // Logic for the dice roll and guesses
        model.addAttribute("correct", n == dieRoll);
        return "roll-dice-results";
    }

}
