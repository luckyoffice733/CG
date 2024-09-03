package com.cg.training;

public class ExampleOnVariables {
	//instance Variables
	int empId=1010;
	String empName="smith";
	double  empSal=4000;
	int a=20;
	
	static String companyName="CG";//static variable
	
	public void m1() {//instance method
		int  a;//local variable
		a=10;
		System.out.println("local variable value is : "+a);
		System.out.println("Instance variables value is: "+this.a);//to differentiate local variable
                                                          // and instance we will use this keyword
	}
	public static void m2() {//static method
		System.out.println("Static variable calling: "+companyName);
		System.out.println("REcommended Way is : "+ExampleOnVariables.companyName);
	}
	
	public static void main(String[] args) {
		
		ExampleOnVariables eov = new ExampleOnVariables();
		System.out.println(eov.empId);
		System.out.println(eov.empName);
		System.out.println(eov.empSal); //calling instance variables using object reference
		
		System.out.println("Calling static variables");
		System.out.println(ExampleOnVariables.companyName);
		System.out.println(companyName);//directly call static variable in static methods
		eov.m1();//calling instance method
		
		System.out.println(eov.companyName);//it is not recommended
		
	    ExampleOnVariables.m2();//calling static method using ClassName
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
