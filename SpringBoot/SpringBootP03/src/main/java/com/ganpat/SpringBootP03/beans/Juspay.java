package com.ganpat.SpringBootP03.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Juspay implements Patners{

    Juspay(){
        System.out.println("Juspay Constructor.");
    }
    @Override
    public void Payment(String ammount) {
        System.out.println("Juspay Payment Done for "+ammount);
    }
}
