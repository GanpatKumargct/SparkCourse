package com.Gannu.SpringBootP01.beans;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements Iengine{

    Diesel(){
        System.out.println("Diesel class started");
    }

    public void start(){
        System.out.println("Diesel Car Started....");
    }
}
