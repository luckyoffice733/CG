package com.cg.training.javabean;

public class Test {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		//System.out.println(e1.empId);not visible
		
		//initialization of private instance variables using setter methods
		e1.setEmpId(1001);
		e1.setEmpName("smith");
		e1.setEmpSal(4000);
		
		//getting the employee details using getter methods
		System.out.println("EMployee Details are : ");
		System.out.println(e1.getEmpId()+" "+e1.getEmpName()+" "+e1.getEmpSal());
		
		//using parameter constructor to initialize private instance variables
		Employee e2 = new Employee(1021,"maritn",5000);
		
		//getting the employee details using getter methods
				System.out.println("EMployee Details are : ");
				System.out.println(e2.getEmpId()+" "+e2.getEmpName()+" "+e2.getEmpSal());	
	}

}
