package com.Ganpat.SSRollBackSecurity.Controller;

import com.Ganpat.SSRollBackSecurity.Model.user;
import com.Ganpat.SSRollBackSecurity.Service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    private UserSerivce userSerivce;

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

    @GetMapping("/getUsers")
    public List<user> getUsers(){
        return userSerivce.getUsers();
    }
}
