package com.example.servingwebcontent;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.example.consumeapi.User;


@Controller
public class UserController {
    
    @GetMapping("/user")
    public String getUser(Model model){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<User> user1 = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/todos/1", User.class);
        User user = user1.getBody();
        model.addAttribute("id", user.getId());
        model.addAttribute("Userid", user.getUserId());
        model.addAttribute("Title", user.getTitle());
        model.addAttribute("Completed", user.getCompleted());
        System.out.println("User: " + user1);
        System.out.println("UserTitle: " +user.getTitle());
        System.out.println("id: " +user.getId());
        System.out.println("Userid: " +user.getUserId());
        System.out.println("UserClass: " +user.getClass());
        System.out.println("Completed: " +user.getCompleted());

        return "user";
    }
}
