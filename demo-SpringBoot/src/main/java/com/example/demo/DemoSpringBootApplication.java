package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoSpringBootApplication.class, args);
	
		//ConfigurableApplication SpringApplication.run(DemoSpringBootApplication.class, args);
				ConfigurableApplicationContext context =SpringApplication.run(DemoSpringBootApplication.class, args);
				   Student sob=context.getBean(Student.class);
				   //System.out.println(sob);
				      sob.display();
	}

}
