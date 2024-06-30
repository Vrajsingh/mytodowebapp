package com.learn.springboot.mytodowebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
    
    private Logger logger = LoggerFactory.getLogger(getClass());

    // @RequestMapping("login")
    // @ResponseBody
    // public String sayLogin() {
    //     return "login";
    // }

    // Whenever we want to pass any parameters from controller to jsp we use MODELs

    @RequestMapping("login")
    public String goToLoginPage(@RequestParam String name, ModelMap model) {
        model.put("name", name);

        logger.debug("Request param is {}", name);
        logger.info("I want this to be printed in info level.");
        logger.warn("I want this to be printed in warn level.");
        return "login";
    }
    
}
