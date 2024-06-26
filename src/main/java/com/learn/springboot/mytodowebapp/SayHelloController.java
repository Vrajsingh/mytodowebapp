package com.learn.springboot.mytodowebapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// "say hello" => "Hello, What are you learning today ?"                   

@RestController
public class SayHelloController {
    
    @RequestMapping("say-hello")
    public String sayHello() {
        return "Hello, What are you learning today ?";
    }
}
