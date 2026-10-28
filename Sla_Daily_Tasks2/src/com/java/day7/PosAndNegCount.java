package com.java.day7;

import java.util.Scanner;

public class PosAndNegCount {
	
	void PosNeg(int [] arr) {
		
		int PosCount = 0;
		int NegCount = 0;
		int ZeroCount = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] > 0) {
				PosCount++;
				
			}else if(arr[i]<0){
				NegCount++;
			}
			else {
				ZeroCount++;
			}
		}
		
		System.out.println("PosCount: "+PosCount);
		System.out.println("NegCount: "+NegCount);
		System.out.println("ZeroCount: "+ZeroCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PosAndNegCount obj = new PosAndNegCount();
Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		
		System.out.print("Enter the array values: ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		obj.PosNeg(arr);
	}

}
