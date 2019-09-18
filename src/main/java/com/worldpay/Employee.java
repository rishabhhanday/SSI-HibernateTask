package com.worldpay;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;


@Entity
public class Employee {
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}

	public Employee() {
		super();
	}

	@Id
	private int empNo;                                 
	public Employee(int empNo) {
		super();
		this.empNo = empNo;
	}

	private String employeeName;
	private int salary;
	@OneToOne
	private Laptop laptop;
	@OneToMany(mappedBy="emp")
	private List<Vehicles> vehicle;
	@ManyToMany
	private List<Project> project;

	public Employee(int empNo, String employeeName, int salary, Laptop laptop,
			List<Project> list1) {
		super();
		this.empNo = empNo;
		this.employeeName = employeeName;
		this.salary = salary;
		this.laptop = laptop;
		
		this.project = list1;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public List<Vehicles> getList() {
		return vehicle;
	}

	public void setList(List<Vehicles> list) {
		this.vehicle = list;
	}

	public List<Project> getList1() {
		return project;
	}

	public void setList1(List<Project> list1) {
		this.project = list1;
	}
}
