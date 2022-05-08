package com.edu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class MainApp {

	public static void main(String[] args) 
	{
		Configuration con= new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Course.class);
		 ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		 SessionFactory factory= con.buildSessionFactory(reg);
		 Session session= factory.openSession();
		 Transaction t= session.beginTransaction();
		 
		 Course c5=new Course(5, "cloud", 10000.00f);
		 session.save(c5);
		Course c6=new Course(6, "mainframe", 12000.00f);
				 session.save(c6);
		/* Course c3=new Course(3, "SQL", 15000.00f);
				 session.save(c3);
				 Course c4=new Course(4, "C#", 15000.00f);
				 session.save(c4);*/
		 
		
		 Set<Course>courses=new HashSet<Course>(Arrays.asList(c6));
		 Student s3=new Student(13, "deepika", "6789878989");
		// Student s2=new Student(12, "Swetha", "9880759393");
		 s3.setCourselist(courses);
		 Set<Course>courses1=new HashSet<Course>(Arrays.asList(c5));
		 Student s4=new Student(14, "tharani", "7788989890");
		 s4.setCourselist(courses1);
		 session.save(s3);
		 session.save(s4);
		 t.commit();
		 session.close();

	}

}