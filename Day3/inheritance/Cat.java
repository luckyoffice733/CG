package com.cg.training.inheritance;

public class Cat extends Animal1{//single inheritance
	
	public void bark() {
		System.out.println("Meow's Meow's");
	}

	public static void main(String[] args) {
		 Cat cobj = new Cat();
		 cobj.eat();
		 cobj.bark();
		
		
	}
	
	
}
