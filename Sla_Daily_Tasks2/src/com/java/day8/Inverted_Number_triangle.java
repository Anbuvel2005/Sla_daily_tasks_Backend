package com.java.day8;

public class Inverted_Number_triangle {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			int spaces = 5-i;
			
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+ " ");
			}
			System.out.println();
		}


	}

}
