package com.cg.training.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ExampleOnList5 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("papaya");
		al.add("banana");
		al.add("apple");
		al.add("kiwi");
		al.add("mango");
		al.add("papaya");
		
		System.out.println("No of elements : "+al.size());
		System.out.println("Insertion Order is preserved: ");
		System.out.println(al); //[papaya,banana,apple,kiwi,mango,papaya]
		
		Collections.sort(al);
		System.out.println("After sort in ascending order: ");
		System.out.println(al);//[apple,banana,kiwi,mango,papaya,papaya]
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("After sort in descending order: ");
		System.out.println(al);//[papaya,papaya,mango,kiwi,banana,apple]
		
				
	}
}
