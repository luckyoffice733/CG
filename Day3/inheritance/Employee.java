package com.cg.training.inheritance;

public class Employee extends Person{
	
	int empId=2121;
	double empSal=3000;
	
	public void employeeDetails() {
		System.out.println("Employee Detials are : ");
		System.out.println(this.empId+" "+this.empSal);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.display();
		e.employeeDetails();
		
		
		
	}

}
