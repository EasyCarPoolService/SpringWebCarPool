package com.Easy.webcarpool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping
    public String Welcome(){
        return "Welcome";
    }

}
