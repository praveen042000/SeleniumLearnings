package com.PraveenOOps;

 class ClothingProduct extends Product {
	private String size;
	 private String material;
	 
	 public ClothingProduct(int productId, String productName, double price, String size, String material) {
	     super(productId, productName, price);
	     this.size = size;
	     this.material = material;
	 }
	 
	 public String getSize() {
	     return size;
	 }
	
	 // Getter for material
	 public String getMaterial() {
	     return material;
	 }
	
	 // Override displayInfo method to display clothing product information
	 @Override
	 public void displayInfo() {
	     System.out.println("CLOTHING PRODUCT INFORMATION:");
	     System.out.println("Product ID: " + getProductId());
	     System.out.println("Product Name: " + getProductName());
	     System.out.println("Price: $" + getPrice());
	     System.out.println("Size: " + size);
	     System.out.println("Material: " + material);
	 }

}
