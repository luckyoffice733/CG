package com.cg.training.list;

import java.util.ArrayList;
import java.util.Collection;

public class ExampleOnList4 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		//insert 
		al.add(30);
		al.add(10);
		al.add(5);
		al.add(40);
		al.add(25);
		al.add(50);
		al.add(15);
		al.add(10);
		
		Collection<Integer> cl = new ArrayList<>();
		cl.add(100);
		cl.add(245);
		
		//adding Collection Object into arrayList
		al.addAll(cl);
	
		System.out.println("No of elements in the arraylist al is : "+al.size());
		System.out.println("Insertion order is preserved: "+al);
				
	}
}
