package com.java.day2;

public class StudentResult {
	
	
	int calculateTotal(int Tamil,int English,int Maths,int Science,int Social_science) {
		int sum = Tamil + English + Maths + Science + Social_science;
		
		return sum;
	}
	
	float calculateAverage(int total) {
		float Average = total / 5;
		return Average;
	}
	
	char calculateGrade(float Avg) {
		return  Avg>90?'A':
			Avg>75 && Avg<89?'B':
				Avg > 50 && Avg <74?'C':
					'F';
		
		
	}
	
	void display(int total,float Avg,char Grade) {
		System.out.println("total: "+total+" average: "+Avg+" grade: "+Grade);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentResult obj = new StudentResult();
		int total = obj.calculateTotal(85, 78, 92, 88, 77);
		float Avg = obj.calculateAverage(total);
		char Grade = obj.calculateGrade(Avg);
		obj.display(total,Avg,Grade);
		

	}

}
