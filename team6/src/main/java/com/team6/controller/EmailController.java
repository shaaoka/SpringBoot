package com.team6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.team6.model.EmailRequest;
import com.team6.model.EmailService;




@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

   
    
    
    @PostMapping("/sendEmail")
    public String sendEmail(@RequestBody EmailRequest request) {
        emailService.sendEmail(request.getTo(), request.getSubject(), request.getText());
        return request.getText();
    }
    

}