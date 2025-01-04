package com.Gannu.SpringBootP01.beans;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements Iengine{

    Petrol(){
        System.out.println("Petrol class started");
    }
    public void start(){
        System.out.println("petrol car Started....");
    }
}
