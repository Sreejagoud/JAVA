package com.sree;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee 
{ @Id
	
	private int empid;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsalary() {
		return esalary;
	}
	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}
	private String ename;
	private float esalary;
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
}
