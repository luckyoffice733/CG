package com.cg.training;

public class ExampleOnDataTypesAndDefaultValues {
	
	int studentId;
	long marks;
	float percent;
	double totalMarks;
	char grade;
	boolean result;
	
	//class type
	String s;
	Object obj;
	Chair cobj;//it will  act as user defined data type
	
	public static void main(String[] args) {
		ExampleOnDataTypesAndDefaultValues eodv = new ExampleOnDataTypesAndDefaultValues();
		System.out.println(eodv.studentId);//0
		System.out.println(eodv.marks);//0
		System.out.println(eodv.percent);//0.0;
		System.out.println(eodv.totalMarks);//0.0
		System.out.println(eodv.grade); //\\u000
		System.out.println(eodv.result);//false
		System.out.println(eodv.s);//null
		System.out.println(eodv.obj);//null
		System.out.println(eodv.cobj);//null
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
