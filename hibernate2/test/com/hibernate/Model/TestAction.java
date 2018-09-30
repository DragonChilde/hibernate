package com.hibernate.Model;

import static org.junit.jupiter.api.Assertions.*;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.mysql.cj.xdevapi.SessionFactory;

class TestAction {
	private static SessionFactory sessionFactory;
	
	@BeforeClass
	public static void beforeClass()
	{
		sessionFactory = (SessionFactory) new AnnotationConfiguration().configure().buildSessionFactory();
	}
	
	@AfterClass
	public static void afterClass()
	{

	}

	@org.junit.jupiter.api.Test
	void test() {
		new SchemaExport(new AnnotationConfiguration().configure()).create(false, true);
	}
	
	public void testSaveUser()
	{
		User user = new User();
		user.setName("u_test");
		Group group = new Group();
		group.setName("g_test");
	}
	
	public void main()
	{
		beforeClass();
	}

}
