package com.java.day7;

import java.util.Scanner;

public class EvenAndOddCount {
	
	void EvenOddCount(int arr[]) {
		
		int OddCount = 0;
		int EvenCount = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				EvenCount++;
			}else {
                OddCount++;
			}
			
		}
		
		System.out.println("OddCount: "+OddCount);
		System.out.println("EvenCount: "+EvenCount);
		
	}

	public static void main(String[] args) {
		EvenAndOddCount obj = new EvenAndOddCount();
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		
		System.out.print("Enter the array values: ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		obj.EvenOddCount(arr);

	}

}
