package com.cg.training.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleOnList1 {

	public static void main(String[] args) {
		//for heterogeneous elements the Generic Element Type is  Object
		ArrayList<Object> al = new ArrayList<>();//creating object for ArrayList
		//adding an elements into ArrayList we will add(Object e)
		al.add("smith");//String
		al.add(true);//Boolean
		al.add(10);//Integer
		al.add('c');//Character
		al.add(20.0f);//Float
		al.add(30.0);//Double
		al.add(null);//null values allowed
		al.add(10);//Integer  //duplicate allowed
		
		System.out.println("No of elements or objects stored in arraylist : "+al.size());
		System.out.println("Insertion order is preserved");
		System.out.println(al);
		
		System.out.println("Getting an object or element at specific index position 5th:");
		System.out.println(al.get(5));
		
		System.out.println("Displaying the element using iterator");
      //first get the iterator object with calling an method iterator()	using Collection object
	//once get iterator object ,we need check elements exits or not using hasNext() ->
    //if exists print the element using next().
		
	    Iterator<Object> iobj=	al.iterator();
		
	    while(iobj.hasNext()) {
	    	System.out.println(iobj.next());
	    }
		
		System.out.println("Displaying the elements using enhanced forloop");
		for(Object o:al) {
			System.out.println(o);
		}	
	}
}
