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

    @RequestMapping("say-hello-html")
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();

        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My first HTML Page</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My first HTML page with Body");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }
}
