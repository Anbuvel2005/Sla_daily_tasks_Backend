package com.java.day1;
import java.util.Scanner;
//3.Electricity Bill — Local Variables
//
//Question: Calculate the electricity bill using a method and local variables. Rates: first 100 units ₹2/unit, next 100 units ₹3/unit, and above 200 units ₹5/unit.
public class Current_Bill {
	
 void bill_cal() {
		Scanner sc = new Scanner(System.in);
		
		int current_bill = 0;
		
		System.out.print("Enter the unit: ");
		int unit = sc.nextInt();
		sc.close();
		
		if(unit <=100) {
			current_bill = unit * 2;
			System.out.println("current_bill: "+current_bill);
		}
		else if( unit <=200) {
			current_bill = (100 * 2) + ((unit -100)*3) ;
			System.out.println("current_bill: "+current_bill);
		}
		else {
			current_bill = (100 * 2) + ((100) * 3) + ((unit - 200) * 5);
			System.out.println("current_bill: " + current_bill);
			
		}
		
	}
	
	public static void main(String[] args) {
		Current_Bill obj = new Current_Bill();
		obj.bill_cal();
      
		
	}

}
