package com.cg.training.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleOnHashSet4 {
	public static void main(String[] args) {
		HashSet<Product> hs = new HashSet<>();
		//Interface Reference Variable Holding its implementation class Object
		//Set<Product> hs = new HashSet<>();
		
		//first create the product objects
		Product p = new Product(1031,"mouse",400);
	    Product p2 = new Product(1212,"laptop",5000);
	    Product p3 = new Product(1243,"mobile",10000); 
	    Product p4 =new Product(1031,"mouse",400);//duplicate object
	    Product p5=new Product(1043,"mouse",400);
	    
	    System.out.println("p hashCode is : "+p.hashCode());
	    System.out.println("p4 hashCode is : "+p4.hashCode());
	    
	    //adding product objects into HashSet
		hs.add(p);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		hs.add(p5);
		
		System.out.println("No of Objects added into HashSet : "+hs.size());
		System.out.println("order :");
		System.out.println(hs);
		
		System.out.println("Displaying the elements using iterator");
		Iterator<Product> iobj = hs.iterator();
		while(iobj.hasNext()) {
		  // System.out.println(iobj.next());
			Product pt =iobj.next();
			System.out.println(pt.getProductId()+" "+pt.getProductName()+" "+pt.getPrice());
			
		}	
	}

}
