package com.cg.eis.service1;

import com.cg.eis.bean1.Employeenew;

public class EmployeeServiceImp1 implements EmployeeService1{
	
	public void getEmployeeDetails(Employeenew emp)
	{
		System.out.println("Employee Details: "+"\n"+"ID: "+emp.getId()+"\n"+"Salary: "+emp.getSalary()+"\n"+"Designation"+emp.getDesignation()+"\n"+emp.getInsuranceScheme());
	}
	public void displayDetails(Employeenew emp)
	{
		System.out.println("Employee Details: "+"\n"+"ID: "+emp.getId()+"\n"+"Salary: "+emp.getSalary()+"\n"+"Designation"+emp.getDesignation()+"\n"+emp.getInsuranceScheme());
	}
	public String insuranceschemefind(int salary, String designation) {
		if(salary>23000 && designation=="Associate Engineer")
		{
			return "Premium Scheme";
		}
		else if(salary>25000 && designation=="Senior Software Engineer")
		{
			return "Diamond Scheme";
		}
		else 
		{
			return "Basic Scheme";
		}
		
	}
}
