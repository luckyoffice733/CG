package com.cg.training.inheritance;

public class TestOnAggregation {
	
	public static void main(String[] args) {
		Course c = new Course(212,"Java",5000);
		Student1 s1 = new Student1(1011,"allen","java33",c);
		
		System.out.println("Student Details Are:");
		System.out.println("Student Id "+s1.sid);
		System.out.println("Student Name :"+s1.sname);
		System.out.println("BatchCode: "+s1.batchCode);
		
		System.out.println("Course Enrolled");
		System.out.println("Course Id : "+s1.cobj.cid);
		System.out.println("Course Name: "+s1.cobj.cname);
		System.out.println("Course Fees: "+s1.cobj.fees);
		
		
	}

}
