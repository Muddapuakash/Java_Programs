package com.methods;


//Problem: Create Employee class with name, id, salary, department. 
//Add methods to display info and calculate annual salary.

public class Employee {
	String name;
    int employeeId;
    double monthlySalary;
    String department;
    
    public void displayInfo() {
        System.out.println("===== EMPLOYEE INFO =====");
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeId);
        System.out.printf("Monthly Salary: Rs. %.2f%n", monthlySalary);
        System.out.println("Department: " + department);
        System.out.println("=========================");
    }
    
    public double calculateAnnualSalary() {
        return monthlySalary * 12;
    }
    
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Rajesh Kumar";
        emp.employeeId = 1001;
        emp.monthlySalary = 50000.00;
        emp.department = "IT";
        
        emp.displayInfo();
        System.out.printf("Annual Salary: Rs. %.2f%n", 
                         emp.calculateAnnualSalary());
    }

}
