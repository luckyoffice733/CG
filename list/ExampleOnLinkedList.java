package com.cg.training.list;

import java.util.Iterator;
import java.util.LinkedList;

public class ExampleOnLinkedList {

	public static void main(String[] args) {
		//for heterogeneous elements the Generic Element Type is  Object
		LinkedList<Object> ll = new LinkedList<>();//creating object for ArrayList
		
		//adding an elements into LinkedList we will add(Object e)
		ll.add("smith");//String
		ll.add(true);//Boolean
		ll.add(10);//Integer
		ll.add('c');//Character
		ll.add(20.0f);//Float
		ll.add(30.0);//Double
		ll.add(null);//null values allowed
		ll.add(10);//Integer  //duplicate allowed
		
		System.out.println("No of elements : "+ll.size());
		System.out.println("Insertion Order is preseved");
		System.out.println(ll);
		//adding element at last
		ll.addLast("ramu");
		ll.addFirst(40.0f);
		
		System.out.println("After adding at first and last position");
		System.out.println(ll);
		
		ll.add("rahul");
		ll.add(10);
		
		System.out.println(ll);
       
		//removing an object 10 at firstOccurance
		ll.removeFirstOccurrence(10);
		System.out.println("After remove after occurance object : ");
		System.out.println(ll);
		System.out.println("Using while loop");
		Iterator<Object> iobj= ll.iterator();
		while(iobj.hasNext()) {
			System.out.println(iobj.next());
		}
		
		System.out.println("Using Enhanced forLoop");
		for(Object o:ll) {
			System.out.println(o);
		}
		
			
		
		
		
		
		
		
		
		
		
		
			}
}
