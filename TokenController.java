package com.example.demo1;


import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

    @GetMapping("/generate-token")
    public String generateToken() {
        // Generate a random token
    	System.out.println("inside generateToken()");
        String token = UUID.randomUUID().toString();
        // Return the token
        return token;
    }
}

