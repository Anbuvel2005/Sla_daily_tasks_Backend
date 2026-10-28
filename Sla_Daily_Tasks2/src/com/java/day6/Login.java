package com.java.day6;


//Q4. Login Attempt System
//
//A user has three login attempts. If the password is correct, display “Login Successful” and stop the loop. Otherwise, display “Invalid Password.”
//
//- Use: while and break
public class Login {
int password = 2024;
	int attempts = 3;
	void loginSystem(int entered_password) {
		int i = 0;
		while(i<attempts) {
		if(password == entered_password) {
			System.out.println("Login Success");
			break;
		
			}
		else {
			System.out.println("Login UnSuccess");
		}
		i++;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login obj = new Login ();
		obj.loginSystem(2025);
	}

}
