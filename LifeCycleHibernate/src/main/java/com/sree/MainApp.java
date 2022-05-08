package com.sree;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



public class MainApp
{

	public static void main(String[] args)
	{
        Laptop lob=new Laptop();
		lob.setLid(987);
		lob.setLname("lenovo");
		lob.setPrice(50000);
		
		Student sob=new Student();
		sob.setRollno(10);
		sob.setName("keerthi");

		sob.setMark(96);
		sob.setLp(lob);
		
		Configuration conn=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);	
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
		SessionFactory sf=conn.buildSessionFactory(reg);
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		
		sess.save(lob);
		sess.save(sob);
		tx.commit();
	}

}
