
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {
    @GetMapping("/api/token")
    public String getToken() {
        return TokenGenerator.generateToken();
    }
}
