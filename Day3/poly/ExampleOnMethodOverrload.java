package com.cg.training.poly;

public class ExampleOnMethodOverrload {
	
	public void addition(int x,int y) {
		int sum =x+y;
		System.out.println("sum of two numbers is : "+sum);
	}
	//difference in no of parameters
	public  int addition(int x,int y,int z) {
		return x+y+z;
	}
	//difference in data type
	public  double  addition(double x, double y) {
		System.out.println("we are in two parameters of double");
		return x+y;
	}
	public  float addition(float x, float y) {
		System.out.println("we are in two parameters of float");
		return x+y;
	}
	public static void main(String[] args) {
		ExampleOnMethodOverrload eov = new ExampleOnMethodOverrload();
		eov.addition(10,20);//addition(int,int);
		
		double res =eov.addition(10.0,30.0);//addition(double,double);
		System.out.println("Sum of double values is : "+res);
		
		float res1 =eov.addition(50.0f,30.0f);//addition(float,float);
		System.out.println("Sum of float values is : "+res1);
		
		int res3 =eov.addition(30, 40,50);//addition(int,int,int)
		System.out.println("sum of three numbers is : "+res3);
		
	}
	
	
}
