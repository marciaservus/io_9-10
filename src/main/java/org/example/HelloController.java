package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "LABORATORIA 13-14!";
    }
    @GetMapping("/ping")
    public String ping() {
        return "Stanisław i Marta";
    }
}
