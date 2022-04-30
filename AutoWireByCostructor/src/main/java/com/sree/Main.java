package com.sree;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class Main {

		public static void main(String[] args) {
			ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
			Human ob=(Human) ctx.getBean("humanobj");
			ob.humanFunction();

		}

	}
