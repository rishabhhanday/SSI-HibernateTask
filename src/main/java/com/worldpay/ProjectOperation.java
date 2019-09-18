package com.worldpay;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProjectOperation {
	void insertProject(Session session) {
		Project p1 = new Project(1,"Java");
		Project p2 = new Project(2,"DotNet");
		Project p3 = new Project(3,"Oracle");
		Transaction tr = session.beginTransaction();
		session.save(p1);
		session.save(p2);
		session.save(p3);
		tr.commit();
	}

	public static void main(String... sd) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		ProjectOperation po = new ProjectOperation();
		po.insertProject(session);
	}
}
