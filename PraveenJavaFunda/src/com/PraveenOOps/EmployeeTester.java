package com.PraveenOOps;

public class EmployeeTester {
	 public static void main(String[] args) {
	        // Create an instance of Employee
	        Employee1 e = new Employee1(6504, "Praveen", "Manager", 50000.0);
	        System.out.println("Initial Employee Information:");
	        e.displayInfo();
	        e.increaseSalary(10.0);  // Increase salary by a percentage	        
	        e.increaseSalary(5.0, 2000.0); // Increase salary by a percentage and apply a bonus
	    }

}
