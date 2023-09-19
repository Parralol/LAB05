package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.consumeapi.Guess;

@Controller
public class GuessController {
    Guess xd = new Guess();
    @RequestMapping(value="/guess")
    public String getGuess(Model model){
        
        model.addAttribute("score", xd.getScore());
        return "/guess";
    }


    @RequestMapping(value="/guess", method = RequestMethod.POST)
    public String Guess(Model model, int guess){
        boolean res = xd.makeGuess(guess);
        model.addAttribute("score", xd.getScore());
        model.addAttribute("res", xd.getGuess());
        if(res){
            xd.reset();
            return "/Congratulation";
        }else{
            return "/guess";
        }
    }
}
