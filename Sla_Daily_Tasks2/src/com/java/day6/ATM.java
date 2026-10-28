package com.java.day6;

public class ATM {


int Pin;
double balance;

ATM(int Pin, double balance) {
    this.Pin = Pin;
    this.balance = balance;
}

void Withdraw(int enteredPin, double amount) {

    if (enteredPin == Pin) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn successfully");
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }

    } else {
        System.out.println("Incorrect PIN");
    }
}

public static void main(String[] args) {

    ATM obj = new ATM(2020, 20000);

    obj.Withdraw(2020, 30000);
}


}
