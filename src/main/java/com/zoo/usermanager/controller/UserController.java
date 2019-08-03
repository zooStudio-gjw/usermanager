package com.zoo.usermanager.controller;


import com.zoo.usermanager.model.User;
import com.zoo.usermanager.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private IUserService userService ;

    @RequestMapping("/user")
    public String findAllUser(Model model){
        List<User> users = userService.findAllUser();
        model.addAttribute("users",users);

        return "user";
    }

    @RequestMapping("/user/insert")
    public void insertUser(){
        User user = new User();
        userService.insertUser(user);
    }
}
