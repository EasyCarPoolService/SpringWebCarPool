package com.Easy.SpringSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String index(){
        return "index";
    }
    @GetMapping("/Welcome")
    public String Welcome(){
        return "Welcome";
    }
}
