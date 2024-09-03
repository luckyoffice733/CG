package com.cg.training;

public class Product {
	
	int productId;
	String productName;
	double price;
	
	public Product(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	
	public static void main(String[] args) {
		
		Product p = new Product(1001,"mouse",400);
		
		//Product p1 = new Product();
		
		
	}
	

}
