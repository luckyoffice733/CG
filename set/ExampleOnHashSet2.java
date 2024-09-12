package com.cg.training.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class ExampleOnHashSet2 {
	public static void main(String[] args) {
		HashSet<Integer>  hs = new HashSet<>();
 		
		hs.add(20);
		hs.add(10);
		hs.add(25);
		hs.add(9);
		hs.add(20);
		hs.add(15);
		hs.add(20);//Integer //duplicates not allowed , it will ignore the duplicates. 
		hs.add(30);
		
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
	    Iterator<Integer> iobj=	hs.iterator();
		while(iobj.hasNext()) {
		System.out.println(iobj.next());
		}
		
		System.out.println("Using Enhanced For loop");
		for(Integer o:hs) {
			System.out.println(o);
		}
		 
		  //Collections.sort(List<E>) will take List as argument
         //we can convert HashSet object into ArrayList using Constructor then we can use sort() 
		ArrayList<Integer> al = new ArrayList<>(hs); //
		System.out.println("Before sort : "+hs);
		Collections.sort(al);
		System.out.println("After Sort Ascending Order: "+al);
		Collections.sort(al,Comparator.reverseOrder());
		System.out.println("After Sort in descending order: "+al);
		
		System.out.println("After sort converting array list into Hashet");
		HashSet<Integer> hs1 = new HashSet<>(al);
		System.out.println("After Convert:"+hs1); //random order
		
		
	}
}
