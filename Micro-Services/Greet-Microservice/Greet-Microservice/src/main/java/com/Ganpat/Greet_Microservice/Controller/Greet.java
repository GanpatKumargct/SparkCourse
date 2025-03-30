package com.Ganpat.Greet_Microservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greet {

    @GetMapping("/greet")
    public String greet(){
        return "Good Morning buddy ";
    }
}
