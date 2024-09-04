package com.cg.training.poly;

public class Test extends  ExampleOnOverride1 {
	
	int a=20;
	
	public void m2() {
		String s1 =super.sayHello("Fazil");//calling parent class method using super keyword
		System.out.println("From parent class : "+s1);
		System.out.println("we are in m2 method of test class");
		System.out.println("from parent class "
				+ "variable : "+super.a);//10
	}
	
	@Override
	public String sayHello(String s){
		return "HI "+s;
	}
	
	
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.m2();
		t1.m1();
		
		System.out.println(t1.sayHello("allen"));
		System.out.println(t1.a);//20
		
	}

}
