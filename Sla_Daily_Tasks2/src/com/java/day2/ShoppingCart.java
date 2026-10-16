package com.java.day2;
import java.util.Scanner;
public class ShoppingCart {
	
	double  calculateTotal(double Biriyani,double Chicken_gravy,double soup  ) {
		return  Biriyani + Chicken_gravy+soup;
		
	}

    double calculateDiscount(double sum,String mem_type) {
    	return mem_type.equals("Gold")? sum * 0.2 :
    		mem_type.equals("Silver")? sum * 0.1:
    			mem_type.equals("Regular")? sum * 0.05:0;
    		}
    
 double   calculateFinalAmount(double sum,double discount) {
	 double Final = sum - discount;
	 return Final;
 }
    
    void display(double total,double discount,double final_amount) {
    	System.out.println("Total: "+total);
    	System.out.println("Discount: "+discount);
    	System.out.println("Final_amt: "+final_amount);
    }
    
    
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ShoppingCart obj = new ShoppingCart ();
		
		System.out.print("Enter the prod1 price: ");
		double prod1 = sc.nextInt();
		
		System.out.print("Enter the prod2 price: ");
		double prod2 = sc.nextInt();
		
		System.out.print("Enter the prod3 price: ");
		double prod3 = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Membership Type: ");
		String Membership_Type = sc.nextLine();
		
		sc.close();
		
		
		double sum = obj.calculateTotal(prod1,prod2 , prod3);
		double discount = obj.calculateDiscount(sum, Membership_Type);
		
		
		
		double final_amount = obj.calculateFinalAmount(sum, discount);
		obj.display(sum, discount, final_amount);
		
		
		

	}

}
