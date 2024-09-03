package com.cg.training;

public class Chair {
	//object properties   //instance variables
	String material="plastic";
	String color="black";
	int noOfWheels=4;
	
	//defining chair object behavior in the form of methods
	//instance methods
	public void chairMoveable() {
		
		System.out.println("Chair is movieable");
	}
	
	public void seatHeightAdjustable() {
		System.out.println("Chair seat heignt can be adjustable");
	}  
	
	public static void main(String[] args) {
		//syntax to create the object for the class
		//ClassName refereceVaraible = new ClassName();
		Chair chair   = new Chair();
		//accessing the instance variables using refereceName.variableName
		System.out.println("Chair object properties");
		System.out.println(chair.color+" "+chair.material+" "+chair.noOfWheels);
	
		//calling the instance methods using refereName.methodName();
		chair.chairMoveable();
		chair.seatHeightAdjustable();
			
		
	}
	
	

}
