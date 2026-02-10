package com.java.Fundamentals;

import java.util.Scanner;

/**
 * Age Calculator
 * Exercise 2 - Day 1
 * 
 * Calculates approximate age based on birth year.
 * Uses constant for current year.
 * 
 * Demonstrates:
 * - Integer input
 * - Constants
 * - Basic arithmetic
 * 
 * @author Codegnan IT Solutions
 * @version 1.0
 */
public class AgeCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define current year as constant
        final int CURRENT_YEAR = 2024;
        
        // Prompt and read birth year
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        
        // Calculate age
        int age = CURRENT_YEAR - birthYear;
        
        // Display result
        System.out.printf("You are approximately %d years old in %d.%n",
                         age, CURRENT_YEAR);
        
        // Close scanner
        scanner.close();
    }
}
