package com.cg.training;

import java.util.Scanner;

public class ExampleOnBreakWithLoop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int i=1;
		while(i<=n) {System.out.print(i+" ");
			if(i==6) {
			break; //out of the loop
			}
			System.out.print(i+" ");
			i++;
		}
		System.out.println(" ");
		System.out.println("Exit from the loop");
		
		
		
	}
	
}
