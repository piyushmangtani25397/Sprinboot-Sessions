# Sprinboot-Sessions

TokenGenerator.java- This code generates a random UUID as a string, which can be used as a session/access token.

TokenValidationFilter.java- This filter uses Spring's @Component annotation to make it a bean. Also added the @Override annotations to the init, doFilter, and destroy methods to override the corresponding methods in the javax.servlet.Filter interface.

TokenController.java- This code creates a REST endpoint at /api/token that returns a new token whenever it's requested.

Application.java- Registers the filter and the REST endpoint in the Spring Boot application. This code creates a Spring Boot application and registers the TokenValidationFilter as a filter for all requests that match the /api/* pattern. It also registers the TokenController as a REST endpoint at /api/token.
