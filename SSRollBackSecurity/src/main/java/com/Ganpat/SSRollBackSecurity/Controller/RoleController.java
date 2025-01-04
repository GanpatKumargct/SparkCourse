package com.Ganpat.SSRollBackSecurity.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

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
