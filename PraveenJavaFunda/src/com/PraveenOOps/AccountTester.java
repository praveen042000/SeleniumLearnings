package com.PraveenOOps;
import java.util.Scanner;

public class AccountTester {

	 public static void main(String[] args) {
	        Customer cus = new Customer(901233, "PETER", 'M');  //given the value of user
	        Account acc = new Account(3456, cus, 0.0);  //given the account details
	        Scanner sc = new Scanner(System.in);      // getting the input from user to choose the value

	        System.out.println("Account Details"+"\n"+"Account_ID : " + acc.getId() + "\n"
	                + "Customer_ID : " + cus.getId() + "\n"
	                + "Customer_Name : " + cus.getName() + "\n"
	                + "Customer_Gender : " + cus.getGender() + "\n"
	                + "Account_Balance : " + acc.getBalance()); // printing the value of account details

	        boolean flag = true;

	        while (flag) {
	            System.out.println("1. Withdraw\n"
	                    + "2. Deposit\n"
	                    + "3. Check Balance\n"
	                    + "4. Exit");

	            int n = sc.nextInt();

	            switch (n) {
	                case 1:
	                    System.out.println("Enter Amount to Withdraw: ");
	                    double withdrawAmount = sc.nextDouble();
	                    acc.withdraw(withdrawAmount);
	                    break;
	                case 2:
	                    System.out.println("Enter Amount to Deposit: ");
	                    double depositAmount = sc.nextDouble();
	                    acc.deposit(depositAmount);
	                    break;
	                case 3:
	                    System.out.println("Current Balance: " + acc.getBalance());
	                    break;
	                case 4:
	                    System.out.println("Thank You for Banking With us!");
	                    flag = false;
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	                    break;
	            }
	        }
	    }
}
