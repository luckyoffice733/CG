package com.cg.training;

public class ExampleOnMethods {
	void m1() {
		System.out.println("we are in m1");
	}
	
	protected int getAddition(int x,int y) {
		return x+y;
	}
	
	public String sayHello() {
		return "weclom to java";
	}
	                                           //static method
	public static String getMsg(String s) {//called method
		return "Hi "+s;
	}	
	
	public static void main(String[] args) {
		
	String mg =	ExampleOnMethods.getMsg("ravi");//calling method  with value --> call by value
	System.out.println(mg);	
	System.out.println(ExampleOnMethods.getMsg("smith"));
	
	ExampleOnMethods eom = new ExampleOnMethods();
	eom.m1();
	int res=eom.getAddition(20,50);
	System.out.println("sum of two numbers is : "+res);
	
	System.out.println(eom.sayHello());
	
	
	
		
	}
	
	
	

}
