package com.ganpat.rollBasedAuth.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rolecontroller {


    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String AdminKaMethods(){
        return "This is a Admin";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @GetMapping("/user")
    public String UserKaMethod(){
        return "This is a USER or May Admin";
    }
}
