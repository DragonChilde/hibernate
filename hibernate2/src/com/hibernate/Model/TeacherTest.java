package com.hibernate.Model;

import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class TeacherTest {

	public static void main(String[] args) {
/*		TeacherPk pk = new TeacherPk();
		pk.setId(20);
		pk.setName("test");
		*/
	/*	Teacher t = new Teacher();*/
		/*t.setId(20);*/
	/*	t.setName("teacher8");
		t.setTitle("test8");
		t.setAge(40);
		t.setD(new Date());
		t.setType(Type.A);
		
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		Session session  = sessionFactory.openSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();*/
		
		//delete();
		//testLoad();
		//testGet();
		//testUpdate();
		//testUpdateB();
		//testUpdateC();
		//testClear();
		//testUpdateD();
		//testFlush();
		testSaveOrUpdate();
	}
	
	public static void delete()
	{
		Teacher t = new Teacher();
		t.setId(6);
		
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		Session session  = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(t);
		session.getTransaction().commit();
		sessionFactory.close();
	}
	
	public static void testLoad()
	{
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		Session session  = sessionFactory.openSession();
		session.beginTransaction();
		Teacher t = (Teacher)session.load(Teacher.class,7);
		session.getTransaction().commit();

		
		System.out.print(t.getName());
	}
	
	public static void testGet()
	{
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		Session session  = sessionFactory.openSession();
		session.beginTransaction();
		Teacher t = (Teacher)session.get(Teacher.class,7);
		session.getTransaction().commit();
		sessionFactory.close();
		
		System.out.print(t.getName());
	}
	
	public static void testUpdate()
	{
		Teacher t = new Teacher();
		t.setId(12);
		t.setName("test9");
		
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		Session session  = sessionFactory.openSession();
		session.beginTransaction();
		session.update(t);
		session.getTransaction().commit();
		sessionFactory.close();

	}
	
	public static void testUpdateB()
	{

		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		Session session  = sessionFactory.openSession();
		session.beginTransaction();
		Query q = session.createQuery("update Teacher t set t.name='test11' where t.id=12");
		q.executeUpdate();
		session.getTransaction().commit();
		//sessionFactory.close();
		

	}
	
	
	public static void testUpdateC()
	{

		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		Session session  = sessionFactory.openSession();
		session.beginTransaction();
		Teacher t = (Teacher)session.get(Teacher.class, 12);
		session.getTransaction().commit();

		t.setName("test13");
		
		Configuration cfg2 = new Configuration();
		SessionFactory sessionFactory2 = cfg2.configure().buildSessionFactory();
		Session session2  = sessionFactory2.openSession();
		session2.beginTransaction();
		session2.update(t);
		session2.getTransaction().commit();

	}
	
	public static void testUpdateD()
	{
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Teacher t = (Teacher)session.load(Teacher.class, 12);
		t.setName("test17");

		session.getTransaction().commit();
	}
	
	public static void testSaveOrUpdate()
	{
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Teacher  t = new Teacher();
		t.setName("test20");
		t.setD(new Date());
		t.setTitle("test20");
		session.saveOrUpdate(t);
		session.getTransaction().commit();
		
		t.setName("test21");
		Session session2 = sessionFactory.getCurrentSession();
		session2.beginTransaction();
		session2.saveOrUpdate(t);
		session2.getTransaction().commit();
	}
	
	
	public static void testClear()
	{
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();

		Session session  = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Teacher t = (Teacher)session.load(Teacher.class, 12);
		System.out.println(t.getName());
	

		session.clear();
	
		Teacher t2 = (Teacher)session.load(Teacher.class, 12);
		System.out.println(t2.getName());
		session.getTransaction().commit();

	}
	
	public static void testFlush()
	{
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();

		Session session  = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Teacher t = (Teacher)session.load(Teacher.class, 12);
		t.setName("ttt1");
		session.flush();
		t.setName("ttttt1");
		session.getTransaction().commit();
	}
	

}
