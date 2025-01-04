package com.ganpat.SpringBootP03.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class RozarPay implements Patners{

    RozarPay(){
        System.out.println("RozarPay Constructor.");
    }

    @Override
    public void Payment(String ammount) {
        System.out.println("RozarPay Payment Done for "+ammount);
    }
}
