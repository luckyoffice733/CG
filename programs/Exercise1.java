package com.cg.training;

import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the employee Name");
		String ename=sc.nextLine();
		
		System.out.println("Enter the employy id:");
		int empId = sc.nextInt();
		/* String ename=sc.next(); */
	
		
		System.out.println("Enter the employeeSal");
		double sal = sc.nextDouble();
		
		
		
		System.out.println("Employee Details are :");
		System.out.println(empId+" "+ename+" "+sal);
		
		
		
	}

}
