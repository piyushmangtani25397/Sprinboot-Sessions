package com.example.demo1;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TokenValidationFilterConfig {

    @Bean
    public FilterRegistrationBean<TokenValidationFilter> tokenValidationFilterRegistration() {
    	
    	System.out.println("inside tokenValidationFilterRegistration()");
        FilterRegistrationBean<TokenValidationFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new TokenValidationFilter());
        registration.addUrlPatterns("/api/*"); // Apply the filter to all endpoints under "/api"
        return registration;
    }
}
