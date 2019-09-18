package com.worldpay;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeOperation {
	void insertEmployee(Session session){
		ArrayList<Project> al = new ArrayList<Project>();
		Transaction tr = session.beginTransaction();
		al.add(new Project(1));
		al.add(new Project(2));
		al.add(new Project(3));
		Employee e1 = new Employee(2,"Prakhar",2000,new Laptop(1),al);
		session.save(e1);
		tr.commit();
		
	}
	void getEmployee(Session session){
		
		Employee e1 = (Employee)session.get(Employee.class,1);
		System.out.println(e1);
		List<Project> projects = e1.getList1();
		//System.out.println(projects);
		for(Project p :projects){
			System.out.println(p);
			
		}
		List<Vehicles> veh = e1.getList();
		for(Vehicles v :veh){
			System.out.println(v);
			
		}
		
		
	}
	public static void main(String... sd) {
	EmployeeOperation eo = new EmployeeOperation();
	Session session = new Configuration().configure().buildSessionFactory().openSession();
	//eo.insertEmployee(session);
	eo.getEmployee(session);
	}
}
