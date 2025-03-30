package com.Ganpat.Welcome_Api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WelcomApi {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/welcome")
    public String welcome(){
        String res = restTemplate.getForObject("http://localhost:8080/greet", String.class);
        return res + ", Welcome to unit of microservices";
    }

}
