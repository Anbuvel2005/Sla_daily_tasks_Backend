package com.java.day7;

import java.util.Scanner;

public class Average {

	int AverageArr(int [] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		
		int average = sum / arr.length;
		return average;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Average obj = new Average();
		
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		
		System.out.print("Enter the array values: ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Average: "+obj.AverageArr(arr));
	}

}
