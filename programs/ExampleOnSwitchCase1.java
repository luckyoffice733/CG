package com.cg.training;

import java.util.Scanner;

public class ExampleOnSwitchCase1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ch=sc.next();
		int a=sc.nextInt();
		int b= sc.nextInt();  
		
		switch(ch) {
		
		case "+" : System.out.println("sum of two numbers is: "+(a+b));
		            break;
		case "-" : System.out.println("substraction of two numbers is: "+(a-b));
        			break;
		case "*" : System.out.println("multi of two numbers is: "+(a*b));
        			break;
        default:System.out.println("Invalid Operator");
        		break;
		            
		
		}
		
		
		
		
		
		
	}

}
