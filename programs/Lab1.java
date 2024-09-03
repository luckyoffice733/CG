package com.cg.training;

import java.util.Scanner;

public class Lab1 {

	public	int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
			}       
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int nt = sc.nextInt();
		
		Lab1 l1 = new Lab1();
		int res=l1.calculateSum(nt);
		System.out.println("Sum of n natural numbers which are divisable by 3 or 5 : "+res);
		
	
		sc.close();
		
	}

}
