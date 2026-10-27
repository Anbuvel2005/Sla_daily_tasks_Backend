package com.java.day5;

class BankAccount {
String accountHolder;
double balance;

BankAccount(String accountHolder, double balance) {
    this.accountHolder = accountHolder;
    this.balance = balance;
}

void displayAccount() {
    System.out.println("Account Holder: " + accountHolder);
    System.out.println("Balance: " + balance);
}

}

class SavingsAccount extends BankAccount {
double interestRate;

SavingsAccount(String accountHolder, double balance, double interestRate) {
    super(accountHolder, balance);
    this.interestRate = interestRate;
}

void displaySavings() {
    displayAccount();
    System.out.println("Interest Rate: " + interestRate + "%");
}

}

class PremiumSavingsAccount extends SavingsAccount {
double bonusInterest;

PremiumSavingsAccount(String accountHolder, double balance,
                      double interestRate, double bonusInterest) {
    super(accountHolder, balance, interestRate);
    this.bonusInterest = bonusInterest;
}

void displayPremium() {
    displaySavings();
    System.out.println("Bonus Interest: " + bonusInterest + "%");
}

}

public class Bank {
public static void main(String[] args) {
BankAccount b = new BankAccount("Anbuvel", 10000);
System.out.println("Bank Account Details");
b.displayAccount();

    SavingsAccount s = new SavingsAccount("Arun", 20000, 5);
    System.out.println("\nSavings Account Details");
    s.displaySavings();

    PremiumSavingsAccount p =
            new PremiumSavingsAccount("Priya", 50000, 6, 2);

    System.out.println("\nPremium Savings Account Details");
    p.displayPremium();
}

}