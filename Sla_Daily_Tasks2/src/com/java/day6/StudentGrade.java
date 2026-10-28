package com.java.day6;

public class StudentGrade {
	
	String Grade(int marks) {
		return (marks >= 90 && marks <= 100)?"A":
			(marks >= 75 && marks <=89 )?"B":
				(marks >= 50 && marks <=74)?"C":(marks<50)?"F":"Invalid";
					
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StudentGrade obj = new  StudentGrade();
		System.out.println( obj.Grade(101));
	}

}
