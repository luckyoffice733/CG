package com.cg.training;

import java.util.Scanner;

public class ExampleOnWhileLoop {
	
	public static void multiply(int i,int n) {
		System.out.println(n+" x "+i+" = "+n*i);
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int i=1;
		while(i<=10) {
			//ExampleOnWhileLoop.multiply(i, n);
			System.out.println(n+" x "+i+" = "+n*i);
			i++;
		}
		
	}

}
