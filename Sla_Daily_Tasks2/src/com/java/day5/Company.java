package com.java.day5;




class Employee{
	String name = "Anbu";
	double salary = 20000;
}

class developer extends Employee{
	String programming_language = "Java";
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("programming_language: "+programming_language);
	}
}

class tester extends Employee{
	String Testing_tool = "Selenium";

	void display() {
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Testing_tool: "+Testing_tool);
		
	}

	
}
public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		developer obj1 = new developer();
		obj1.display();
		
		System.out.println("-----------------------------------------------------------");
		
		tester obj2 = new tester();
		obj2.display();
	

	}

}
