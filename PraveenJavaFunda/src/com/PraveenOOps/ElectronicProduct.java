package com.PraveenOOps;

public class ElectronicProduct extends Product {
private int warrantyPeriod;

public ElectronicProduct(int productId, String productName, double price, int warrantyPeriod) {
  super(productId, productName, price);
  this.warrantyPeriod = warrantyPeriod;
}

// Getter for warrantyPeriod
public int getWarrantyPeriod() {
  return warrantyPeriod;
}

// Override displayInfo method to display electronic product information
public void displayInfo() {
  System.out.println("ELECTRONIC PRODUCT INFORMATION:");
  System.out.println("Product ID: " + getProductId());
  System.out.println("Product Name: " + getProductName());
  System.out.println("Price: $" + getPrice());
  System.out.println("Warranty Period: " + warrantyPeriod + " Months");
}
}
