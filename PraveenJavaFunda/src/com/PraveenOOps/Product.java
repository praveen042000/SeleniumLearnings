package com.PraveenOOps;

abstract class Product {  // creating abstract class
	private int productid;
	private String productName;
	private double price;
	
	 public Product(int productId, String productName, double price) {
		 this.productid= productId;
			this.productName= productName;
			this.price=price;
	}
	public int getProductId() {  //getter method
		 return productid;
	 }
	 public String getProductName() {  //getter method
		 return productName;
	 }
	 
	 public double getPrice() {    //getter method
	     return price;
	 }
	 
	 abstract void displayInfo();

}
