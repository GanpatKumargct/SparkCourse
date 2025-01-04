package com.ganpat.SpringBootP03.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class PhonePay implements Patners
{
    PhonePay(){
        System.out.println("PhonePay Constructor.");
    }

    @Override
    public void Payment(String ammount) {
        System.out.println("PhonePay Payment Done for "+ammount);
    }

}
