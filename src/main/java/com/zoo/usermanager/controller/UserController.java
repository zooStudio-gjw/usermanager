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
    public String findAllUser(Model model) throws Exception{
        List<User> users = userService.findAllUser();
        model.addAttribute("users",users);

        if(users.size() != 0){
            throw  new Exception("运行时异常");
        }

        return "user";
    }

    @RequestMapping("/user/insert")
    public void insertUser() throws RuntimeException{
        User user = new User();
        if(user != null)
            throw new RuntimeException("插入异常");
        userService.insertUser(user);
    }
}
