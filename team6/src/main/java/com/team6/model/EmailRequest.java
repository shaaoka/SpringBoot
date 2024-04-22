package com.team6.model;

import lombok.Getter;
import lombok.Setter;

public class EmailRequest {
	
	// Getters and Setters
    @Getter@Setter	private String to;
    @Getter@Setter	private String subject;
    @Getter@Setter	private String text;

    // Constructors
    public EmailRequest() {
    }

    public EmailRequest(String to, String subject, String text) {
        this.to = to;
        this.subject = subject;
        this.text = text;
    }

   
  
}