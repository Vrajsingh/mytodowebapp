package com.learn.springboot.mytodowebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// "say hello" => "Hello, What are you learning today ?"                   

@Controller
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

    // "say-hello-jsp" => sayHello.jsp
    // jsp will be created in path :  /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    // if multiple jsp then
    // jsp will be created in path :  /src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
    // jsp will be created in path :  /src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
    // jsp will be created in path :  /src/main/resources/META-INF/resources/WEB-INF/jsp/todo.jsp
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello"; // returning name of the jsp
    }
}
