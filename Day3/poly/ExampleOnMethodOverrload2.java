package com.cg.training.poly;

public class ExampleOnMethodOverrload2 {
	
	public void addition(int x,int y) {
		System.out.println("int type parameters");
		System.out.println("sum of two numbers is : "+(x+y));
	}
	
	public double addition(double x,double y) {
		System.out.println("double type parameters");
		return x+y;
	}
	
	public static void main(String[] args) {
		ExampleOnMethodOverrload2 eov2 = new ExampleOnMethodOverrload2();
		eov2.addition(10,50);//addition(int,int)
		//method overloading automatic type promotion
		eov2.addition('a','A'); //addition(char,char) ->addition(int,int)
		
	double res=	eov2.addition(10.0,30.0);//addition(double,double)
	System.out.println("sum of two number : "+res);	
	                                   //method overloading automatic type promotion
	double res1 =eov2.addition(40L,40l);//addition(long,long)->addition(float,float)->addition(double,double)
	System.out.println("sum of two numbers of long values : "+res1);
	
	}

}
