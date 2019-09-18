package com.worldpay;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Vehicles {
	@Id
	private int vehicleNo;
	private String companyName;
	private int price;
	@ManyToOne
	private Employee emp;

	public Vehicles(int vehicleNo, String companyName, int price,Employee emp) {
		super();
		this.vehicleNo = vehicleNo;
		this.companyName = companyName;
		this.price = price;
		this.emp = emp;
	
	}

	public Vehicles(int vehicleNo) {
		super();
		this.vehicleNo = vehicleNo;
	}

	public int getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getPrice() {
		return price;
	}

	public Vehicles() {
		super();
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Vehicles [vehicleNo=" + vehicleNo + ", companyName=" + companyName + ", price=" + price + "]";
	}
}
