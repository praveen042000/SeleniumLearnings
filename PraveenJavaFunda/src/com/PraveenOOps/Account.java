package com.PraveenOOps;

public class Account {
	private int id;
	private Customer customer;
	private double balance = 0.0;
	public Account(int id, Customer customer) {
		this.id = id;
		this.customer = customer;
	}
	public Account(int id, Customer customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}

	public int getId() {  //getter method
		return id;
	}

	public Customer getCustomer() {   //getter method
		return customer;
	}

	public double getBalance() {  //getter method
		return balance;
	}
	public void setBalance(double balance) { // setter method
		this.balance = balance;
	}

	@Override
	public String toString() {                          //method overloading
		return customer.toString() + " Balance: " + balance;
	}
	public String getCustomerName() {
		return customer.getName();
	}

	public double deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return balance;
		} else {
			System.out.println("Invalid deposit amount");
			return balance;
		}
	}
	public double withdraw(double amount) {
	    if (amount < 0) {
	        System.out.println("Please Enter Valid Amount.");
	    } else if (balance >= amount) {
	        balance -= amount;
	        System.out.println(amount + " withdrawn.");
	    } else {
	        System.out.println("Amount withdrawn exceeds the current balance!");
	    }
	    return balance;
	}


}
