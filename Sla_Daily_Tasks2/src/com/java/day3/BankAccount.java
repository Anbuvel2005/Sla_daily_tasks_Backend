package com.java.day3;

public class BankAccount {
	
	double accountNumber ;
	String holderName;
	double balance;
	
	BankAccount(){
		this.accountNumber =1001;
		this.holderName = "Priya";
		this.balance = 5000;
		}
	
	void display() {
		System.out.println("Account Number: " + accountNumber + ", Holder Name: " + holderName + ", Balance: " + balance); 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount obj = new BankAccount();
		obj.display();
	}

}


//Output:Account Number: 1001.0, Holder Name: Priya, Balance: 5000.0