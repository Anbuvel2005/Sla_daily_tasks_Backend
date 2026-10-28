package com.java.day6;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1;i<=30;i++) {
			if(i%3==0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}

	}

}
