import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public FilterRegistrationBean<TokenValidationFilter> tokenValidationFilterRegistration() {
        FilterRegistrationBean<TokenValidationFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new TokenValidationFilter());
        registration.addUrlPatterns("/api/*");
        return registration;
    }
}
