package com.java.day7;
import java.util.Scanner;
public class Largest {

	
	int largestNum(int[] arr) {
		
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Largest obj = new Largest();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		
		System.out.print("Enter the array values: ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print(obj.largestNum(arr));  
	}

}
