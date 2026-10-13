package com.java.day1;
import java.util.Scanner;

//Question: Create three students with different names and roll numbers using a method,
public class Student_Registration {
	String Name;
	int Roll_No;
	
	void display(){
		System.out.println("Stduent Name: "+Name);
		System.out.println("Roll No: "+Roll_No);
		
	}
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//s1
		Student_Registration Student1 = new Student_Registration();
		System.out.print("Enter the Student1 name: ");
		Student1.Name = sc.nextLine();
		System.out.print("Enter the Student1 rollno: ");
		Student1.Roll_No = sc.nextInt();
		sc.nextLine();
		Student1.display();
		
		
		Student_Registration Student2 = new Student_Registration();
		System.out.print("Enter the Student2 name: ");
		Student2.Name = sc.nextLine();
		System.out.print("Enter the Student2 rollno: ");
		Student2.Roll_No = sc.nextInt();
		sc.nextLine();
		Student2.display();
		
		
		Student_Registration Student3 = new Student_Registration();
		System.out.print("Enter the Student3 name: ");
		Student3.Name = sc.nextLine();
		System.out.print("Enter the Student3 rollno: ");
		Student3.Roll_No = sc.nextInt();
		sc.nextLine();
		Student3.display();
		
		
		
	}
	
	

}
