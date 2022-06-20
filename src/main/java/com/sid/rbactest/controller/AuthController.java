package com.sid.rbactest.controller;

import com.sid.rbactest.model.User;
import com.sid.rbactest.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @GetMapping("/user/{id}")
    private User getUser(@PathVariable("id") int id){
        return authService.getUserById(id);
    }

    @PostMapping("/user")
    private User upsertUser(@RequestBody User user){
        return authService.upsertUser(user);
    }

    @GetMapping("/welcome")
    private String welcome(){
        return "Welcome!!";
    }

    @GetMapping("/lol")
    private String lol(){
        return "Welcome lol!!";
    }
}
