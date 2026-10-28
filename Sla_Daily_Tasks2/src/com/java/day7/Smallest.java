package com.java.day7;
import java.util.Scanner;
public class Smallest {

	
	int smallestNum(int[] arr) {
		
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Smallest obj = new  Smallest();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		
		System.out.print("Enter the array values: ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print(obj.smallestNum(arr));  
	}

}
