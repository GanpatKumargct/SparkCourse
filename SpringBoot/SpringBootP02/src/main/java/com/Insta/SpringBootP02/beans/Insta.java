package com.Insta.SpringBootP02.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Insta {

    @Autowired
    Reels reels;

    @Autowired
    LocalDateTime localDateTime;

    public void Play(){
        System.out.println("Login at : "+localDateTime);
        reels.Dance();
    }




}
