package com.Gannu.SpringBootP01.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    Iengine petrol;
    Iengine diesel;

    @Autowired()
    Iengine iengine;
    public void m1(){
        System.out.println("Method 1");
        petrol.start();
    }

    public void m2(){
        System.out.println("Method 2");
        iengine.start();
    }


}
