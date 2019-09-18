package com.worldpay;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Project {
	@Id
	private int pNo;
	private String projectName;
	
	@ManyToMany(mappedBy="project")
	private List<Employee> employee;
	public int getpNo() {
		return pNo;
	}
	public void setpNo(int pNo) {
		this.pNo = pNo;
	}
	@Override
	public String toString() {
		return "Project [pNo=" + pNo + ", projectName=" + projectName + "]";
	}
	public Project() {
		super();
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public Project(int pNo, String projectName) {
		super();
		this.pNo = pNo;
		this.projectName = projectName;
	
	}
	public Project(int pNo) {
		super();
		this.pNo = pNo;
	}
	
}
