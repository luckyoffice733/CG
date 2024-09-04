package com.cg.training.inheritance;

public class Student extends Person {

	int sid =101;
	String batchCod="CG";
	
	public void studentDetails() {
		System.out.println("Student Details are :");
		System.out.println(this.sid+" "+this.batchCod);
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.display();
		s.studentDetails();
		
		
	}
	
	
}
