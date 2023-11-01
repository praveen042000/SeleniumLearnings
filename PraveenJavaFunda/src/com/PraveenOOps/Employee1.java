package com.PraveenOOps;

public class Employee1 {
	 private int employeeId;
	    private String name;
	    private String designation;
	    private double salary;

    public Employee1(int employeeId, String name, String designation, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId + "\n"+ "Name: " + name +"\n" + "Salary: $" + salary);  
    }
    public void increaseSalary(double percentage) {
        double increaseAmount = salary * (percentage / 100);
        salary += increaseAmount;
        System.out.println("Salary increased by " + percentage + "%");
    }
    
    public void increaseSalary(double percentage, double bonus) {
    	
        double increaseAmount = (salary * (percentage / 100)) +(salary * (bonus / 100));
        salary += increaseAmount + bonus;
        System.out.println("Salary increased by " + percentage + "% with a bonus of Rs" + bonus);

    }
   
    
}
