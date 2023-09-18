package com.example.servingwebcontent;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;


@Controller
public class UserController {
    
    @GetMapping("/user")
    public ResponseEntity<User> getUser(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<User> user = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/todos/1", User.class);
        System.out.println("User: " + user);

        return user;
    }
}
