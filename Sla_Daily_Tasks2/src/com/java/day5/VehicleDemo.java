package com.java.day5;


class Vehicle {
	void start() {
System.out.println("Vehicle is starting");
}


void stop() {
    System.out.println("Vehicle is stopping");
}


}

class Car extends Vehicle {
void displayType() {
System.out.println("Type: Car");
}
}

class Bike extends Vehicle {
void displayType() {
System.out.println("Type: Bike");
}
}

public class VehicleDemo {
public static void main(String[] args) {
Car c = new Car();


    System.out.println("Car Details");
    c.displayType();
    c.start();
    c.stop();

    Bike b = new Bike();

    System.out.println("\nBike Details");
    b.displayType();
    b.start();
    b.stop();
}


}
