package com.cg.training.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ExampleOnList3 {
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

		System.out.println("No of elements in the arraylist al is : "+al.size());
		System.out.println("Insertion order is preserved: "+al);
		
		//for sort we will static sort() from Collections class 
		//Collections.sort(list) //by default it will sort in ascending order
		//Collections.sort(list,Comparator obj);//this method for descending order    
		
		Collections.sort(al);
		System.out.println("After sort in ascending order is :");
		System.out.println(al);
		
		System.out.println("After sort in desending order");
		Comparator<Object> c=Collections.reverseOrder();
		Collections.sort(al,c); //Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		al.clear();
		System.out.println("After making list as empty:");
		System.out.println(al);
	
		
	}
}
