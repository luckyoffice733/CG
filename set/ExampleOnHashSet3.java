package com.cg.training.set;

import java.util.HashSet;
import java.util.Iterator;

public class ExampleOnHashSet3 {
	public static void main(String[] args) {
		HashSet<String>  hs = new HashSet<>();
 		
		hs.add("mango");
		hs.add("apple");
		hs.add("kiwi");
		hs.add("dragon");
		hs.add("orange");
		hs.add("kiwi");
		hs.add("papaya");//Integer //duplicates not allowed , it will ignore the duplicates. 
		hs.add(null);
		
		System.out.println("No of elements : "+hs.size());//
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
	    Iterator<String> iobj=	hs.iterator();
		while(iobj.hasNext()) {
		System.out.println(iobj.next());
		}
		
		System.out.println("Using Enhanced For loop");
		for(String s :hs) {
			System.out.println(s);
		}
			
		
		
		
		
	}
}
