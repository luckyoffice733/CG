package com.cg.training;

import java.util.Scanner;

public class ExampleOndoWhileLoop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int i=1;
		do {
			System.out.println(n+" x "+i+" = "+n*i);
			i++;
		}while(i<=10);
		
		
		
	}

}
