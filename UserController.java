package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class UserController {

    @GetMapping("/path-variable")
    public String getPost(){
        return "login successfull";
    }
}
