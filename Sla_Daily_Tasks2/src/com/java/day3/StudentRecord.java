package com.java.day3;

public class StudentRecord {
     
	int rollNumber;
		String studentName;
		double marks;
		
		StudentRecord (	int rollNumber,
		String studentName,
		double marks){
			this.rollNumber = rollNumber;
			this.studentName = studentName;
			this.marks  = marks;
			
		}
		
		StudentRecord(StudentRecord obj){
			this.rollNumber = obj.rollNumber;
			this.studentName = obj.studentName;
			this.marks = obj.marks;
			
		}
		
		void disp() {
			System.out.println("RollNo: "+rollNumber+"StudentName: "+studentName+"Marks: "+marks);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentRecord obj1 = new StudentRecord(21,"Anbu",100);
		StudentRecord obj2 = new StudentRecord (obj1);
		
		obj1.disp();
		obj2.disp();
		
		//changeing the copy constructor value
		obj2.marks = 90;
		
		obj1.disp();
		obj2.disp();
		
	}

}
