package com.security.SecurityAppForBank.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankOpration {

    @GetMapping("/ContactUs")
    public String ContactUs(){
        return "Mob : +91 9955652437\nEmail : ganpatstudy@gmail.com";
    }

    @GetMapping("/Updated")
    public String Updated(){
        return "Intrest rate upto 2%off on instamart credit card withdrawl";
    }

    @GetMapping("/Transaction")
    public String Transaction(){
        return "Transfer Successfully Completed";
    }

    @GetMapping("/CheckBalance")
    public String CheckBalance(){
        return "A/c Balance : 10,000";
    }


}
