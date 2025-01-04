package com.security.SecurityAppForBank.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebConnfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(req ->
                req.requestMatchers("/Updated", "/ContactUs").permitAll()  //isme security nhi lagana hai
                        .anyRequest().authenticated()                             //baki sab me security laga do
        ).formLogin(Customizer.withDefaults()).httpBasic(Customizer.withDefaults());

        return httpSecurity.build();

    }
}
