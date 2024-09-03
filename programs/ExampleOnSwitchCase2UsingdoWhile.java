package com.cg.training;

import java.util.Scanner;

public class ExampleOnSwitchCase2UsingdoWhile {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c ='y';
		do {
	    System.out.println("Operations");
	    System.out.println("Enter 1 For Addition");
	    System.out.println("Enter 2 For Subtraction");
	    System.out.println("Enter 3 For Multiplication");
	    System.out.println("Entet 4 For exit the loop");
	    System.out.println("Enter the choice");
	    int ch=sc.nextInt();
	    System.out.println("Enter the first value:");
	    int a=sc.nextInt();
	    System.out.println("Enter the second value");
		int b= sc.nextInt(); 
		
		switch(ch) {
		
		case 1 : System.out.println("sum of two numbers is: "+(a+b));
		            break;
		case 2 : System.out.println("substraction of two numbers is: "+(a-b));
        			break;
		case 3: System.out.println("multi of two numbers is: "+(a*b));
        			break;
		case 4: System.out.println("exit from the operation");
			      c='Y';
			      break;
        default:System.out.println("Invalid Operator");
                 System.exit(0);
        		break;            
		}
		}while(c!='Y');
		
	}

}
