package com.team6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    @GetMapping("/hello")
    public String hello(
            @RequestParam(name = "name", required = false) String name,
            Model model) {
        model.addAttribute("name", name); 
        return "hello";
    }
}
