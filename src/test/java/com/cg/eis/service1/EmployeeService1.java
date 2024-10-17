package com.cg.eis.service1;

import com.cg.eis.bean1.Employeenew;

public interface EmployeeService1 {
	void getEmployeeDetails(Employeenew emp);
	void displayDetails(Employeenew emp);
	String insuranceschemefind(int salary,String designation);
}
