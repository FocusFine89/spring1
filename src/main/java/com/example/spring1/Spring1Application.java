package com.example.spring1;

import com.example.spring1.entities.Menu;
import com.example.spring1.entities.Pizze;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(Spring1Application.class, args);



		Menu menu = ctx.getBean(Menu.class);
		System.out.println(menu);
	}



}
