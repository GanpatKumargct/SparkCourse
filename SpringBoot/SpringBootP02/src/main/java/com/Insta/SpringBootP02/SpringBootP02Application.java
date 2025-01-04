package com.Insta.SpringBootP02;

import com.Insta.SpringBootP02.beans.Insta;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootP02Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootP02Application.class, args);
		Insta bean = context.getBean(Insta.class);
		bean.Play();


	}

}
