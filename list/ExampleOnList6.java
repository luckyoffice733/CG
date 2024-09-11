package com.cg.training.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ExampleOnList6 {
	public static void main(String[] args) {
		ArrayList<Product> al = new ArrayList<>();

		Product p = new Product();
		//Initialize the product object using setters
		p.setProductId(1212);
		p.setProductName("mouse");
		p.setPrice(400);

		Product p1 = new Product(301,"laptop",50000);
		//adding product objects into ArrayList
		al.add(p);
		al.add(p1);
		al.add(new Product(2121,"mobile",10000));

		System.out.println("No of product Project stored : "+al.size());
		System.out.println(al);

		Iterator<Product> iobj=	al.iterator();
		System.out.println("Product Details are ");
		while(iobj.hasNext()) {
		Product pobj=iobj.next();
		System.out.println(pobj.getProductId()+" "+pobj.getProductName()+" "+pobj.getPrice());
			
		}
		System.out.println("Product Details using enhanced for loop");
		for(Product pt:al) {
		  System.out.println(pt.getProductId()+" "+pt.getProductName()+" "+pt.getPrice());	 
		}
		MyComparator m = new MyComparator();//creating a Object for myComparator
         ///Collections.sort(list,Comparator)
        Collections.sort(al,m); //custom sorting

        System.out.println("After Sorting in descending Order Product Details are");
		for(Product pt:al) {
		  System.out.println(pt.getProductId()+" "+pt.getProductName()+" "+pt.getPrice());	 
		}







	}
}
