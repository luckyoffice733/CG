package com.cg.training;

public class ExampleOnTypeCasting {
	
	public static void main(String[] args) {
		
		int a=10;
		System.out.println("Int variable value is : "+a);
		
		double d =a;
		System.out.println("after convert int variable value into double : "+d);
		
		//type casting
		int i=65;
		System.out.println("Int value is : "+i);
		char c=(char) i;
		System.out.println("After converting int to char is : "+c);
		
		String s="hello";
		System.out.println("String is : "+s);
		Object o=s; //Directly Convert Child Class Object into Parent Class Object
		System.out.println("After convert string to Object class : "+o);
		//type casting
		Object ob1="helloworld"; //parent
		System.out.println("Super class variable value is : "+ob1);
		//Child
		String s2 =(String) ob1;//with the help of () operator we can convert Parent Class Object to child
		System.out.println("sub class variable value is : "+s2);
		
		
	}

}
