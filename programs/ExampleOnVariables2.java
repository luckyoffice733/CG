package com.cg.training;

public class ExampleOnVariables2 {
	
	int empId=1001;
	String empName="smith";
	double empSal=4000;
	
	static { //static block
		System.out.println("We are in static block");
	}
	
	{//instance block or anyonyous block
		System.out.println("instance block");
	}
	
	public static void main(String[] args) {
		System.out.println("we are in main method");
		
		ExampleOnVariables2 eov2 = new ExampleOnVariables2();
		
	}
	


}
