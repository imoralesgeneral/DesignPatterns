package com.patterns.prototype;

public class TestRun {

	public static void main(String[] args) {
		
		PrototypeFactory factory = new PrototypeFactory();
		Product product1 = (Product) factory.create("Product 1");
		System.out.println("This is the product 1: "+product1);
		Product product2 = (Product) factory.create("Product 1");
		System.out.println("This is the product 2: "+product2);
		((ProductA)product2).setAttributeA(5);
		System.out.println("After changes...");
		System.out.println("This is the product 1: "+product1);
		System.out.println("This is the product 2: "+product2);
		
	}

}
