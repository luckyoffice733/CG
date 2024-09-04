package com.cg.training.inheritance;

public class Alphonas extends Mango{
	
	String color;
	
	public void aplhosDetails() {
		System.out.println(this.color);
	}
	
	public static void main(String[] args) {
		
		Alphonas aobj = new Alphonas();
		aobj.shape="oblong";
		aobj.color="purple to yellow";
		aobj.taste="mild taste sweet";
		
		aobj.display();
		aobj.mangoDetails();
		aobj.aplhosDetails();
		
	}
	
	

}
