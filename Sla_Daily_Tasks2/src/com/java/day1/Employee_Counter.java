package com.java.day1;

class Employee_Counter {

    int id;
    String name;

    static int count = 0;

    Employee_Counter(int id, String name) {
        this.id = id;
        this.name = name;
        count++;
    }

    static void registerEmployee(int id, String name) {
        Employee_Counter e = new Employee_Counter(id, name);
        System.out.println("Employee Registered: " + e.name);
    }

    public static void main(String[] args) {
    	
    	

        Employee_Counter.registerEmployee(101, "Anbu");
        Employee_Counter.registerEmployee(102, "Arun");
        Employee_Counter.registerEmployee(103, "Kumar");

        System.out.println("Total Employees: " + count);
    }
}