package com.java.day4;

public class Student_management {


String StudentName;
int Studentage;


Student_management(String StudentName) {
    this.StudentName = StudentName;
}


Student_management(String StudentName, int Studentage) {
    this.StudentName = StudentName;
    this.Studentage = Studentage;
}

void display() {
    System.out.println("Student Name: " + StudentName);
    System.out.println("Student Age: " + Studentage);
}

public static void main(String[] args) {

    Student_management s1 = new Student_management("Anbu");
    s1.display();

    System.out.println();

    Student_management s2 = new Student_management("Vel", 25);
    s2.display();
}


}
