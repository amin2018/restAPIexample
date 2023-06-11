package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {
    @GetMapping("/myGetMapping")
    public String getExample() {
        return "Greetings from Spring Boot!";
    }

    @PostMapping("/myPostMapping")
    public String postExample(@RequestBody String name){
        return "hello " + name;
    }
}
