package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    
//    Fragmentation for including
    @GetMapping("/service")
    public String conditionHandler(Model m) {
    	System.out.println("Condition running.............");
    	m.addAttribute("title", "This is controller title");
    	m.addAttribute("subtitle", LocalDateTime.now());

    	return "Fragement";
    }
    @GetMapping("/page")
    public String check(Model m) {
    	System.out.println("base running.............");

    	return "data";
    }
} 