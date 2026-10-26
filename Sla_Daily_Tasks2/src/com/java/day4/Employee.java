package com.java.day4;

class developer {


int EmployeeID;
String name;
double salary;

developer(int EmployeeID, String name, double salary) {
    this.EmployeeID = EmployeeID;
    this.name = name;
    this.salary = salary;
}

void description() {
    System.out.println("Developer should develop the product");
}


}

class Manager extends developer {

Manager(int EmployeeID, String name, double salary) {
    super(EmployeeID, name, salary);
}


void description() {
    System.out.println("Manager should manage the teams and clients");
}


}

public class Employee {


public static void main(String[] args) {

    developer obj1 = new developer(1001, "Anbu", 50000);
    Manager obj2 = new Manager(1005, "Vel", 200000);

    System.out.println("Employee: " + obj1.name);
    obj1.description();

    System.out.println();

    System.out.println("Employee: " + obj2.name);
    obj2.description();
}


}
