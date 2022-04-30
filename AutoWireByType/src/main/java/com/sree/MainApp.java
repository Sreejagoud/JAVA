package com.sree;


	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class MainApp {

		public static void main(String[] args) {
			ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
			AutoWireByTypeHuman ob= (AutoWireByTypeHuman) ctx.getBean("humanobj");
			ob.humanFunction();

		}

	}
