package com.java.day4;
//5. An online payment application supports UPI and credit card payments. Both payment methods must implement a common payment operation,
//but their processing logic differs.
//
//Create an abstract class named Payment with an abstract method processPayment(). Implement it in UPIPayment and CreditCardPayment 
//classes and demonstrate runtime polymorphism.


abstract class Payment{
	abstract void processPayment();
}

  class upiPayment extends Payment{
	  double amount;
	  double charge;
	  
	  upiPayment(double amount, double charge){
	 this.amount = amount;
	 this.charge = charge;
	 }
	  
   void processPayment(){
		double total = amount + charge;
		System.out.println("Total: "+total);
	}
}

  class CreditCardPayment  extends Payment{
	   double amount;
	   double charge;

	  CreditCardPayment(double amount, double charge){
		  this.amount = amount;
			 this.charge = charge;
	  }
	  
	   void processPayment(){
			double total = amount + charge;
			System.out.println("Total: "+total);
		}
	}



public class Payment_Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Upi payment----------------");
		Payment upi = new upiPayment(2000,2);
		upi.processPayment();
		
		
		
		System.out.println("Credit card payment----------------");
		Payment creditCard = new   CreditCardPayment (2000,20);
		creditCard .processPayment();
		

	}

}
