package com.java.day4;

public class Bank {


private String AccountHoldersName;
private double Balance;

public String getName() {
    return AccountHoldersName;
}

public void setName(String AccountHoldersName) {
    this.AccountHoldersName = AccountHoldersName;
}

public double getBalance() {
    return Balance;
}

public void setBalance(double Balance) {
    if (Balance >= 0) {
        this.Balance = Balance;
    } else {
        System.out.println("Invalid balance");
    }
}

public double withdraw(double amount) {
    return (amount > 0 && amount <= Balance)
            ? (Balance -= amount)
            : -1;
}

public void display() {
    System.out.println("Account Holder: " + AccountHoldersName);
    System.out.println("Balance: " + Balance);
}

public static void main(String[] args) {

    Bank obj = new Bank();

    obj.setName("Anbu");
    obj.setBalance(20000);

    System.out.println("Withdrawn balance: " + obj.withdraw(2000));

    obj.display();
}


}
