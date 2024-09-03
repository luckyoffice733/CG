package com.cg.training;

public class Employee {
	
	int empId;
	String empName;
	double empSal;
	static  String companyName="CG";

	public Employee(){//default constructor
		System.out.println("we are in default constructor");
	}
	//parameterized constructor
	public Employee(int empId,String empName,double empSal) {
		System.out.println("we are in parameterized constructor");
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;  
	}
	
	public void display() {
		System.out.println("Employee Details are : ");
		System.out.println(this.empId+" "+this.empName+" "+this.empSal);
	}
	 
	public static void main(String[] args) {
		Employee eobj = new Employee();
		eobj.display();
		
		Employee eobj1 = new Employee(101,"smith",4000);//Employee(int,String,double)
		eobj1.display();
		
     	Employee eobj2 = new Employee(20121,"sumit",50000);
     	eobj2.display();
     	
     	System.out.println(Employee.companyName);
     	
		
	}
	

}
