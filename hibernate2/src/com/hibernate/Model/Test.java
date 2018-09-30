package com.hibernate.Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("test5");
		s.setAge(50);
		
		//Configuration cfg = new Configuration();
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		//Session session  = sessionFactory.openSession();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		sessionFactory.close();
	}

}
