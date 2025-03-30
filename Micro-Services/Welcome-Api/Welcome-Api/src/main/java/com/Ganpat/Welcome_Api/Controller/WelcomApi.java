package com.Ganpat.Welcome_Api.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomApi {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to unit of microservices";
    }

}
