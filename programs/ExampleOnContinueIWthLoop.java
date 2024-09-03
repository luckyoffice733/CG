package com.cg.training;

import java.util.Scanner;

public class ExampleOnContinueIWthLoop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int i=1;
		while(i<=n) {
			if(i==5) {
			  	i++;
				if(i==6){
					i++; //out of the loop
					  continue; //skip the iteration
				}
			  
			}
			System.out.print(i+" ");
			i++;
		}
		System.out.println(" ");
		System.out.println("Exit from the loop");
		
		
		
	}
	
}
