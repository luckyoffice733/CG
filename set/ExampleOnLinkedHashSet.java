package com.cg.training.set;

import java.util.LinkedHashSet;

public class ExampleOnLinkedHashSet {
	
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
		lhs.add(30);
		lhs.add(50);
		lhs.add(30);
		lhs.add(60);
		lhs.add(40);
		lhs.add(25);
		lhs.add(5);
		lhs.add(15);
		
		System.out.println("No of elements : "+lhs.size());
		System.out.println("Insertion order is preserved: ");
		System.out.println(lhs);
		
	   System.out.println("Element exist or not ?: "+lhs.contains(60));
	   System.out.println("Element exist or not ?: "+lhs.contains(100));
		
	    System.out.println("Element is removed or not?:"+lhs.remove(60));
	    System.out.println("After remove "+lhs);
		
		//Display the elements using iterator and enhanced loop
	    
	    
	    
	    
		
		
		
		
	}

}
