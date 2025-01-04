package com.ganpat.SpringBootP03.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {

    Flipkart(){
        System.out.println("Flipkart Constructor");
    }

    @Autowired
//    @Qualifier("juspay")
    Patners patners;

    @Value("${jdbc.url}")
    private String url;
    public void PaymentGateway(String ammount){
        System.out.println(url);
        patners.Payment(ammount);
    }

}
