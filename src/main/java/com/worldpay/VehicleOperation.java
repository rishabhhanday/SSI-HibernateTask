package com.worldpay;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class VehicleOperation {
	void insertVehicle(Session session) {
		Transaction tr = session.beginTransaction();
		Vehicles v1 = new Vehicles(1, "AUDI", 20000, new Employee(1));
		Vehicles v2 = new Vehicles(2, "MARUTI", 5000, new Employee(1));
		Vehicles v3 = new Vehicles(3, "ZEN", 70000, new Employee(1));
		session.save(v1);
		session.save(v2);
		session.save(v3);
		tr.commit();
	}

	public static void main(String... sd) {

		Session session = new Configuration().configure().buildSessionFactory().openSession();
		VehicleOperation vo = new VehicleOperation();
		vo.insertVehicle(session);
	}
}
