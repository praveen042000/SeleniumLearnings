package com.PraveenOOps;

public class ProductTester {
	public static void main(String[] args) {
	     // Create instances of different product types
	     ElectronicProduct laptop = new ElectronicProduct(201, "Laptop", 1200.0, 12);
	     ClothingProduct tShirt = new ClothingProduct(301, "T-Shirt", 25.0, "M", "Cotton");
	
	     // Display product information
	     laptop.displayInfo();
	     tShirt.displayInfo();
	 }

}
 