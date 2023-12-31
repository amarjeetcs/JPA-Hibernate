package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FeatchRecordDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory);
		
		 
	     Session session = factory.openSession();
	     Student student=(Student)session.load(Student.class, 8);
	     System.out.println(student);
	     
	     Address address=(Address)session.get(Address.class, 1);
	     System.out.println(address);
	     
	    
	     session.close();
	     factory.close();

	}

}
