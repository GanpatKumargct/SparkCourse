package com.Ganpat.Welcome_Api.Controller;

import com.Ganpat.Welcome_Api.Repo.GreetApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WelcomApi {

    @Autowired
    GreetApiClient greetApiClient;

    @GetMapping("/welcome")
    public String welcome(){
        String res = greetApiClient.invokeGreet();
        return res + ", Welcome to unit of microservices";
    }

}
