package com.java.day5;

class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	
	void display() {
		System.out.println("Name is "+name+" age is "+age);
	}
	
}



class Student extends Person{
	long rollNo;
	
	Student(String name,int age,int rollNo){
		super(name,age);
		this.rollNo = rollNo;
		
		
	}
	
	
	void display() {
		System.out.println("Name is "+name+" age is "+age+" RollNo is "+rollNo);
	}
	
}



public class University {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		Student obj = new Student("Anbu",21,121);
		obj.display();

	}

}
