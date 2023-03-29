package com.example.demo1;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class TokenValidationFilter extends OncePerRequestFilter {

    /*protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // Get the token from the request header
        String token = request.getHeader("Authorization");
        // Validate the token
        if (isValidToken(token)) {
            // Token is valid, proceed with the request
            filterChain.doFilter(request, response);
        } else {
            // Token is not valid, send a 401 Unauthorized response
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        }
    }*/

    private boolean isValidToken(String token) {
        // TODO: Implement token validation logic here
        // For now, we'll just check that the token is not null or empty
    	System.out.println("token= "+token);
        return token != null && !token.isEmpty();
    }

	@Override
	protected void doFilterInternal(jakarta.servlet.http.HttpServletRequest request,
			jakarta.servlet.http.HttpServletResponse response, jakarta.servlet.FilterChain filterChain)
			throws jakarta.servlet.ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("inside doFilterInternal()");
		
        // Get the token from the request header
        String token = request.getHeader("Authorization");
        // Validate the token
        if (isValidToken(token)) {
            // Token is valid, proceed with the request
        	System.out.println("valid token, sending 200 response");
            //filterChain.doFilter(request, response);
        	response.setStatus(HttpServletResponse.SC_OK);
        } else {
            // Token is not valid, send a 401 Unauthorized response
        	System.out.println("invalid token, sending 401 response");
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        }
		
	}
}
