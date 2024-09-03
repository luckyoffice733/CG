package com.cg.training;

import java.util.Scanner;

public class ExampleOnSumOfNnaturalNumber {

	public int sumOfnumbers(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;//sum+=i
		}
		return sum;
	}
 
	public static void main(String[] args) {
		ExampleOnSumOfNnaturalNumber eosn =new ExampleOnSumOfNnaturalNumber();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();//10
		
		int res=eosn.sumOfnumbers(n);


		System.out.println("Sum of n natural numbers is : "+res);

		sc.close();

	}


}
