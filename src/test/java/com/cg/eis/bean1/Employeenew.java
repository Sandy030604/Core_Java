package com.cg.eis.bean1;

import com.cg.eis.exception.Practice017_Lab3Q3;

public class Employeenew {
	public int id;
	public int salary;
	public String designation;
	public String insuranceScheme;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) throws Practice017_Lab3Q3 {
		if(salary<=3000)
		{
			throw new Practice017_Lab3Q3("Sorry You are not applicable to the insurance scheme");
		}
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	public Employeenew() {
		super();
		this.id = id;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}
	

}
