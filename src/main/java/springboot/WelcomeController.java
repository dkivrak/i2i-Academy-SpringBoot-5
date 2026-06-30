package springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to i2i Academy";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}