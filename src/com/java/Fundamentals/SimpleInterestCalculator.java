package com.java.Fundamentals;

import java.util.Scanner;

/**
 * Simple Interest Calculator
 * Exercise 5 - Day 1
 * 
 * Calculates simple interest and total amount.
 * 
 * Formula: SI = (Principal × Rate × Time) / 100
 * 
 * Demonstrates:
 * - Multiple numeric inputs
 * - Financial calculations
 * - Professional output formatting
 */
public class SimpleInterestCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read principal, rate, time
        System.out.print("Enter principal: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter rate (%): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter time (years): ");
        double time = scanner.nextDouble();
        
        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100.0;
        double totalAmount = principal + simpleInterest;
        
        // Display detailed results
        System.out.println();
        System.out.printf("Principal: Rs. %.2f%n", principal);
        System.out.printf("Rate: %.2f%%%n", rate);
        System.out.printf("Time: %.1f years%n", time);
        System.out.printf("Simple Interest: Rs. %.2f%n", simpleInterest);
        System.out.printf("Total Amount: Rs. %.2f%n", totalAmount);
        
        // Close scanner
        scanner.close();
    }
}
