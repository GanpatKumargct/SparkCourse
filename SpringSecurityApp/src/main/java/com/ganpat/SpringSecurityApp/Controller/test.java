package com.ganpat.SpringSecurityApp.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {


    @GetMapping("/test")

    public String m1(){
        return "Gannu";
    }

    @GetMapping("/log")
    public String login(){
        return "Login..";
    }


}
