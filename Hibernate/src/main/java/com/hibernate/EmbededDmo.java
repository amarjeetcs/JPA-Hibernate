package com.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbededDmo {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Student student1 = new Student();
		student1.setCollege("Ies college bhopal");
		student1.setCountry("india");
		student1.setName("amarjeet");
		student1.setState("Bihar");
		
		Student student2 = new Student();
		student1.setCollege("Ies college bhopal");
		student1.setCountry("india");
		student1.setName("amarjeet");
		student1.setState("Bihar");

		Certificate certificate = new Certificate();
		certificate.setCource("Java");
		certificate.setDuration("6 months");
		student1.setCerti(certificate);

		Session s = factory.openSession();

		Transaction tx = s.beginTransaction();
		s.save(student1);
		s.save(student2);
		tx.commit();
		s.close();
		
		factory.close();

	}

}
