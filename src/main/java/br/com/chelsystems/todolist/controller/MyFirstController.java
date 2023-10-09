package br.com.chelsystems.todolist.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstRoute")
public class MyFirstController {

    @GetMapping("/")    
    public String firstMessage(){
        return "Worked!";
    }
    
}
