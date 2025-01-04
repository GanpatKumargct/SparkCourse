package com.Gannu.SpringBootP01.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    Iengine iengine;
    public void m1(){
        iengine.start();
    }
}
