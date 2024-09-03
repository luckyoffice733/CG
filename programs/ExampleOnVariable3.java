package com.cg.training;

public class ExampleOnVariable3 {
	
	int studentId=2121;
	static String CollegeName="CG";
	
	
	public void m1() {
		System.out.println("we are m1 method");
		System.out.println(ExampleOnVariable3.CollegeName);
		System.out.println(this.studentId);
	}
	
	public static void m2() {
		System.out.println("we are m2 method");
		//System.out.println(this.studentId);
	}
	
	public static void main(String[] args) {
		ExampleOnVariable3 evo3 = new ExampleOnVariable3();
		
		System.out.println(evo3.studentId);
		System.out.println(ExampleOnVariable3.CollegeName);
		
		evo3.m1();
		ExampleOnVariable3.m2();
		
		evo3.studentId=32312;
		System.out.println("After change values is : "+evo3.studentId);
		
		ExampleOnVariable3.CollegeName="CTS";
		System.out.println("After the static variable values is : "+ExampleOnVariable3.CollegeName);
		
		
		
	}
	
	

}
