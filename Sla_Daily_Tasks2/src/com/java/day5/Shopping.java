package com.java.day5;

class Product {


int productId;
double price;

Product(int productId, double price) {
    this.productId = productId;
    this.price = price;
}

void display() {
    System.out.println("ProductId: " + productId);
    System.out.println("Price: " + price);
}


}

class Electronics extends Product {

String productName;

Electronics(int productId, double price, String productName) {
    super(productId, price);
    this.productName = productName;
}

void display() {
    System.out.println("ProductId: " + productId);
    System.out.println("Price: " + price);
    System.out.println("ProductName: " + productName);
}


}

class Clothing extends Product {


String productName;

Clothing(int productId, double price, String productName) {
    super(productId, price);
    this.productName = productName;
}

void display() {
    System.out.println("ProductId: " + productId);
    System.out.println("Price: " + price);
    System.out.println("ProductName: " + productName);
}


}

class Books extends Product {


String productName;

Books(int productId, double price, String productName) {
    super(productId, price);
    this.productName = productName;
}

void display() {
    System.out.println("ProductId: " + productId);
    System.out.println("Price: " + price);
    System.out.println("ProductName: " + productName);
}


}

public class Shopping {


public static void main(String[] args) {

    Product obj1 = new Product(1001, 2000);
    obj1.display();

    System.out.println();

    Electronics obj2 = new Electronics(1002, 50000, "Laptop");
    obj2.display();

    System.out.println();

    Clothing obj3 = new Clothing(1003, 2000, "Bootcut Jean");
    obj3.display();

    System.out.println();

    Books obj4 = new Books(1004, 500, "IKEA");
    obj4.display();
}


}
