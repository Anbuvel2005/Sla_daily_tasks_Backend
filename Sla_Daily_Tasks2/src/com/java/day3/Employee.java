package com.java.day3;

public class Employee {
	
	int employeeId;
	String employeeName; 
	double salary;
	
	Employee(int employeeId,String employeeName,double salary){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	void calculateAnnualSalary() {
		double annual_salary = salary * 12;
		System.out.println("Emp_Id: " +employeeId+" emp_name: "+ employeeName+" annual_salary: "+annual_salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Emp1 = new Employee (101,"Arun",25000);
		Emp1.calculateAnnualSalary();
		
		Employee Emp2 = new Employee (102,"Divya",35000);
		Emp2.calculateAnnualSalary();
		Employee Emp3= new Employee (103,"Kumar",40000);
		Emp3.calculateAnnualSalary();
		
	}

}
