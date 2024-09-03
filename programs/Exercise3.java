package com.cg.training;

import java.util.Scanner;

public class Exercise3 {
	
	public static void main(String[] args) {
		
	  Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		/*
		 * if(a>b && a>c) {
		 * 
		 * System.out.println("a is greater than b,c : "+ a); } else if(b>c && b>a) {
		 * System.out.println("b is greate than a,c: "+b); }else {
		 * System.out.println("c is greater than a,b : "+c); }
		 */
		 
		if(a > b) {
			if(a>c) {
				System.out.println("a is greater than b,c");
			}
		}else {
			if(b>c) {
				if(b>a) {
					System.out.println("b is greater");
				}else {
					System.out.println("c is greater");
				}
			}
		}
		
		
		
		
		
		
		
		
	}

}
