package com.cg.training.inheritance;

public class Student1 {
	
	int sid;
	String sname;
	String batchCode;
	Course cobj; //Has-a relation
	
	public Student1(int sid, String sname, String batchCode, Course cobj) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.batchCode = batchCode;
		this.cobj = cobj;
	}
	
	
	

}
