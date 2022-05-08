package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext con=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Samsung sob=con.getBean(Samsung.class);
		sob.samsungFun();
	}

}
