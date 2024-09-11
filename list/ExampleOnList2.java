package com.cg.training.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleOnList2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		//insert 
		al.add(30);
		al.add(40);
		al.add(5);
		al.add(10);
		al.add(30);
		al.add(25);

		System.out.println("No of elements in the arraylist al is : "+al.size());
		System.out.println("Insertion order is preserved: "+al);

		//replacing elements or insert object at specific index position
		al.set(3,50);
		System.out.println("Replace elements at specific position 3rd");
		System.out.println(al);

		//for search element exist or not using boolean contains(Integer)
		System.out.println("search an element 60 is exist or not?: "+al.contains(60));
		//for search element exist or not using boolean contains(Integer)
		System.out.println("search an element 40 is exist or not?: "+al.contains(40));
		System.out.println(al.get(1));

		//for remove an element using Integer remove(int index)
		System.out.println("After remove an element 5 and return an element :"+al.remove(2));
		System.out.println(al);
      
        System.out.println("Retrieving elements using iterator");
		Iterator<Integer>	iobj= al.iterator();
		while(iobj.hasNext()) {
		System.out.println(iobj.next());
		}

		System.out.println("Using enhanced for loop");
       for(Integer i:al) {
    	  System.out.println(i); 
       }
 
	}
}
