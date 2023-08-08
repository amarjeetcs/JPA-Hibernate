package com.map;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MapDemo {
	public static void main(String[] args) {
		 Configuration cfg=new Configuration();
	      cfg.configure("hibernate.cfg.xml");
	      SessionFactory factory=cfg.buildSessionFactory();
	      
	      Question q1=new Question();
	      q1.setQuestionId(1212);
	      q1.setQuestionName("What is Java?");
	      
	      Answer answer=new Answer();
	      answer.setAnswerId(343);
	      answer.setAnswerName("Java is high level, object oriented programming language");
	      q1.setAnswer(answer);
	      
	      Question q2=new Question();
	      q2.setQuestionId(242);
	      q2.setQuestionName("What is collection?");
	      
	      Answer answer1=new Answer();
	      answer1.setAnswerId(344);
	      answer1.setAnswerName("Group of object in single unit called collection");
	      q1.setAnswer(answer1);
	      
	     
	      
	      
	      Session s=factory.openSession();
	      Transaction tx=s.beginTransaction();
	      s.save(q1);
	      s.save(q2);
	      
	      s.save(answer1);
	      s.save(answer);
	      tx.commit();
	      
	      
	      s.close();
	       
	      factory.close();
	}

}
