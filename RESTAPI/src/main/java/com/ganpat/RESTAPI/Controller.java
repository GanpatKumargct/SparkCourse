package com.ganpat.RESTAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    @GetMapping("home")
    public String Home(){
        System.out.println("Somebody calling you");
        return "Welcome To Home page";
    }
}
