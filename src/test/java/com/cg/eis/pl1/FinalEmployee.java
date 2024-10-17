package com.cg.eis.pl1;

import com.cg.eis.bean1.Employeenew;
import com.cg.eis.exception.Practice017_Lab3Q3;
import com.cg.eis.service1.EmployeeService1;
import com.cg.eis.service1.EmployeeServiceImp1;

public class FinalEmployee {
	public static void main(String args[])
	{
		try {
		Employeenew emp=new Employeenew();
		emp.setId(1);
		emp.setSalary(3000);
		emp.setDesignation("Associate Engineering");
		emp.setInsuranceScheme("Scheme1");
		
		
		EmployeeService1 service=new EmployeeServiceImp1();
		Employeenew emp2=new Employeenew();
		emp2.setId(2);
		emp2.setSalary(50000);
		emp2.setDesignation("Senior Software Engineer");
		emp2.setInsuranceScheme("SCheme 2");
		service.getEmployeeDetails(emp);
		service.displayDetails(emp);
		service.insuranceschemefind(emp.getSalary(), emp.getDesignation());
		
		
		service.displayDetails(emp2);
		service.insuranceschemefind(emp2.getSalary(), emp2.getDesignation());
		}
		catch(Practice017_Lab3Q3 e)
		{
			System.out.println(e.getMessage());
		}
			
	}

}
