package com.java.day8;

public class Inverted_left_triangle {

	public static void main(String[] args) {
		int n = 5;
		for(int i=n;i>=1;i--) {
			int spaces = n -i;
			for(int j=1;j<=spaces;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
