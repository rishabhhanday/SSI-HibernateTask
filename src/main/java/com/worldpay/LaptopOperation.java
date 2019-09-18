package com.worldpay;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LaptopOperation {

	void insertLaptop(Session session) {
		Laptop lap1 = new Laptop(4, "DELL", 50000);
		Laptop lap2 = new Laptop(5, "HP", 40000);
		Laptop lap3 = new Laptop(6, "ASUS", 70000);
		Transaction tr = session.beginTransaction();
		session.save(lap1);
		session.save(lap2);
		session.save(lap3);
		tr.commit();

	}

	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		LaptopOperation lo = new LaptopOperation();
		lo.insertLaptop(session);
		
		session.close();

	}

}
