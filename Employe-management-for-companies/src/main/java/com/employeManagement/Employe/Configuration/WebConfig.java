package com.employeManagement.Employe.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;

@Configuration
@EnableWebSecurity
public class WebConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity security) throws Exception {

       security
               .csrf(csrf-> csrf.disable())
               .authorizeHttpRequests(req ->
                        req.requestMatchers("register", "data", "login").permitAll()
                                .anyRequest().authenticated()
               )
               .formLogin(Customizer.withDefaults())
               .httpBasic(Customizer.withDefaults());

       return security.build();
    }


}
