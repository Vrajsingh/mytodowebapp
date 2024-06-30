package com.learn.springboot.mytodowebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class LoginController {
    
    // @RequestMapping("login")
    // @ResponseBody
    // public String sayLogin() {
    //     return "login";
    // }

    // Whenever we want to pass any parameters from controller to jsp we use MODELs

    @RequestMapping("login")
    public String goToLoginPage(@RequestParam String name, ModelMap model) {
        model.put("name", name);
        return "login";
    }
    
}
