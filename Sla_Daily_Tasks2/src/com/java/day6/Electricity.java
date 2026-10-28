package com.java.day6;


/*Q2. Electricity Bill Calculation

Calculate the electricity bill based on units consumed:

First 100 units: ₹2 per unit

Next 100 units: ₹3 per unit

Above 200 units: ₹5 per unit

Use if-else to calculate the total bill.*/

public class Electricity {
	
	
	double Bill(int units) {
		return (units<=100)? units * 2:
			(units>=100 && units<=200)?(100*2 + (units-100)*3):
				(units>=200)?
				100 * 2 + 100 * 3 + (units - 200) * 5:-1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Electricity obj = new  Electricity();
		System.out.println("Current_Bill: "+obj.Bill(250)) ;
	}

}
