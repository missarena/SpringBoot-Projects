package com.example.controller;

import org.springframework.stereotype.Controller;
import com.example.service.UserService;

import java.util.List;

@Controller
public class userController {
    private UserService userService;

    public userController(UserService userService) {
        this.userService = userService;
    }

    public void createUser(String name){
        userService.addUser(name);
        System.out.println("User added successfully");
    }

    public void listUsers(){
        List<String> users = userService.getAllUsers();
        System.out.println( "All Users" + users);
    }
}
