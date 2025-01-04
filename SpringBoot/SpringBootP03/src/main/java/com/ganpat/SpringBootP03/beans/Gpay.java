package com.ganpat.SpringBootP03.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Gpay implements Patners{

    Gpay(){
        System.out.println("Gpay Constructor.");
    }
    @Override
    public void Payment(String ammount) {
        System.out.println("Gpay Payment Done for "+ammount);
    }
}
