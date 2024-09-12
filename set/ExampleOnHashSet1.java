package com.cg.training.set;

import java.util.HashSet;
import java.util.Iterator;

public class ExampleOnHashSet1 {
	public static void main(String[] args) {
		HashSet<Object>  hs = new HashSet<>();
 		
		hs.add("smith");
		hs.add(10.0f);//Float
		hs.add(true);//Boolean
		hs.add('c');//Character
		hs.add(20);//Integer
		hs.add(300L);//Long
		hs.add(20);//Integer //duplicates not allowed , it will ignore the duplicates. 
		hs.add(null);//Null
		hs.add(30.0);//double
		
		System.out.println("No of elements : "+hs.size());
		System.out.println("Random order : ");
		System.out.println(hs);
	  
		System.out.println("Search an element : using contains");
		boolean b =hs.contains(60);
		System.out.println("Element is found or not ?: "+b);
		
		System.out.println("before remove: "+hs);
		boolean b1 =hs.remove(null); //remove based on Element //remove(<E>);
		System.out.println("Element is removed or not ?: "+b1);
		System.out.println("After remove : "+hs);
		
		//hs.set(),hs.replace() ->LinkedHashSet
	
		System.out.println("Displaying the elements using iterator");
	    Iterator<Object> iobj=	hs.iterator();
		while(iobj.hasNext()) {
		System.out.println(iobj.next());
		}
		
		System.out.println("Using Enhanced For loop");
		for(Object o:hs) {
			System.out.println(o);
		}
			
	}
}
