package com.Ganpat.SSRollBackSecurity.Service;

import com.Ganpat.SSRollBackSecurity.Model.user;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserSerivce {

    private List<user> users = new ArrayList<>();

    public UserSerivce(){
        users.add(new user(UUID.randomUUID().toString(),"Ganpat","ganpat@gmail.com"));
        users.add(new user(UUID.randomUUID().toString(),"Shahu","Shahubuddin@gmail.com"));
        users.add(new user(UUID.randomUUID().toString(),"Manish","Manish@gmail.com"));

    }

    public List<user> getUsers(){
        return this.users;
    }
}
