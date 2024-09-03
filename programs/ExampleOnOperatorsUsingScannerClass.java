package com.cg.training;

import java.util.Scanner;

public class ExampleOnOperatorsUsingScannerClass {
	
	public static void main(String[] args) {  //Arithmetic operators   
		 //short cut to import ctrl+shift+o
		Scanner sc= new Scanner(System.in);
	   
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		float c=a+b;
		System.out.println("Addition is : "+c);
		System.out.println("Substraction is : "+(a-b));
		System.out.println("Multiplication is : "+(a*b));
		System.out.println("Division of two numbers is : "+(b/a));//  10)20(2
		System.out.println("Modulues of two numbers is : "+(a%b));//     20												//		 20
																//		=====
																//		  0
		
	}

}
