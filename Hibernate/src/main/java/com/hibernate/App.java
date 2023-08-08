package com.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException
    {
      Configuration cfg=new Configuration();
      cfg.configure("hibernate.cfg.xml");
      SessionFactory factory=cfg.buildSessionFactory();
      System.out.println(factory);
      
      Student st=new Student();
      //st.setId(104);
      st.setName("Amarjeet");
      st.setCollege("Ies");
      st.setState("Ranchi");
      st.setCountry("India");
      System.out.println(st);
      
      Address ad=new Address();
      ad.setStreet("street");
      ad.setCity("Bhopal");
      ad.setOpen(true);
      ad.setX(10.34);
      ad.setAddedDate(new Date(0));
      
		/*
		 * FileInputStream f=new FileInputStream("src/main/java/pic.jpg"); byte[]
		 * data=new byte[f.available()]; f.read(data); ad.setImage(data);
		 */
      
     Session session = factory.openSession();
     Transaction tx=session.beginTransaction();
     
     session.save(ad);
     session.save(st);
     tx.commit();
     session.close();
     System.out.println("done..");
    }
}
