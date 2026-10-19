
package com.java.day3;

public class Student {

    int studentId;
    String studentName;
    String course;

    void displayDetails() {
        System.out.println("Student ID is " + studentId
                + ", Student Name is " + studentName
                + ", and the Course is " + course);
    }

    public static void main(String[] args) {

        Student obj = new Student();
        
        obj.displayDetails();
    }
}



//Output:Student ID is 0, Student Name is null, and the Course is null