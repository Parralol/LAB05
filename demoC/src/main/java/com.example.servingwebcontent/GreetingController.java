package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "java.html";
    }
    @GetMapping("/usuarios/{id}")
    public ModelAndView todos(@PathVariable String id, Model model) {
        String uri = "https://jsonplaceholder.typicode.com/todos/"+id;
        RestTemplate restTemplate = new RestTemplate();

        Todo todo = restTemplate.getForObject(uri, Todo.class);
        System.out.println("User: " + todo);
        //model.addAttribute("todo", todo);
        ModelAndView modelAndView = new ModelAndView("todo");
        modelAndView.addObject("userId", todo.getUserId());
        modelAndView.addObject("id", todo.getId());
        modelAndView.addObject("title", todo.getTitle());
        modelAndView.addObject("completed", todo.isCompleted());
        return modelAndView;
    }



}