package com.java.day8;

public class Number_Triangle {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			int spaces = 5-i;
			
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}

	}

}

