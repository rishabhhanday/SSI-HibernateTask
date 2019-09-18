package com.worldpay;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
private int lapNo;
private String company;
private int price;
@OneToOne(mappedBy="laptop")
private Employee emp;
public int getLapNo() {
	return lapNo;
}
public Laptop() {
	super();
}
public void setLapNo(int lapNo) {
	this.lapNo = lapNo;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public int getPrice() {
	return price;
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
public Laptop(int lapNo, String company, int price) {
	super();
	this.lapNo = lapNo;
	this.company = company;
	this.price = price;
	
}
public Laptop(int lapNo) {
	super();
	this.lapNo = lapNo;
}


}
