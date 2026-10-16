package com.java.day2;

public class Employee_Salary {
	

	
	
	double calculate_salary(double salary,double allowance) {
	double gross_salary = salary + allowance;
		
		return gross_salary;
	}
	
	
	double calculate_netSalary(double gross,double PF) {
		double net_salary = gross - PF;
		return net_salary;
	}
	
void display(String name,double gross_salary,double net_salary) {
	
	System.out.println("Employee_name is " + name + " and his Gross_salary is " + gross_salary + " with  Net_salary of " + net_salary);
	
}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_Salary obj = new Employee_Salary();
	double gross = 	obj.calculate_salary(25000,5000);
	double net = 	obj. calculate_netSalary(gross,2000);
	obj.display("Anbu",gross,net);
		

	}

}
