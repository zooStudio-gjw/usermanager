package com.zoo.usermanager.controller;


import com.zoo.usermanager.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {


    @RequestMapping("/index")
    public User index(){
        User user = new User();

        return user;
    }

}
