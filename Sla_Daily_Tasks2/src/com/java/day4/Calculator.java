package com.java.day4;




//2.A calculator application performs addition for two integers and two decimal numbers. Another application requires different employee types to calculate bonuses differently.
//
// Write a Java program demonstrating method overloading and method overriding.
public class Calculator {

	int add(int num1,int num2) {
		return num1 + num2;
	}
	
	float add(float num1,float num2) {
		return num1+num2;
	}
}

class parent{
	
	
	
	double bonus(double salary,double bonus) {
		return salary + bonus;
	}
}
	
class child extends parent{
	double bonus(double salary,double bonus) {
	
		return  salary + bonus ;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator obj1 = new Calculator();
		System.out.println("using int: "+obj1.add(12, 34));
		System.out.println("using double: "+obj1.add(12.5F, 34.7F));
		
		parent obj2 = new parent();
		System.out.println(obj2.bonus(20000, 5000));
		
		child obj3 = new child();
		System.out.println(obj3.bonus(30000, 3000));
		
		

	}
}
	


