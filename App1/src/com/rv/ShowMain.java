package com.rv;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ShowMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Employee e = new Employee();
		e.setId(200);
		e.setFirstName("priyanka");
		e.setLastName("Parihar");
		session.persist(e);
		tx.commit();
		session.close();
		System.out.println("successfully saved....");
	}

}
