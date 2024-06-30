package com.learn.springboot.mytodowebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class LoginController {
    
    // @RequestMapping("login")
    // @ResponseBody
    // public String sayLogin() {
    //     return "login";
    // }

    @RequestMapping("login")
    public String sayLogin() {
        return "login";
    }
    
}
