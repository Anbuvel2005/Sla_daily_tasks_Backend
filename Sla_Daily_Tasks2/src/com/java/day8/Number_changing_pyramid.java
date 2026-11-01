package com.java.day8;

public class Number_changing_pyramid {

	public static void main(String[] args) {
		 int num = 1;
        int n = 4;
		    for (int i = 1; i <= n; i++) {
		        for (int j = 1; j <= i; j++) {
		            System.out.print(num + " ");
		            num++;
		        }
		        System.out.println();

	}

}
}
