package com.example.financemate2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/conta")
    public String conta() {
        return "conta";
    }
    
    
}

//127.0.0.1:3306