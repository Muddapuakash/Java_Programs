package com.java.Fundamentals.Day1;

import java.util.Scanner;

/**
 * Simple Greeting Program
 * Exercise 1 - Day 1
 * 
 * Demonstrates:
 * - Basic Scanner usage
 * - String input
 * - String concatenation
 * 
 * @author Codegnan IT Solutions
 * @version 1.0
 */
public class SimpleGreeting {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt and read first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        
        // Prompt and read last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        
        // Display greeting
        System.out.printf("Hello, %s %s! Welcome to Java Programming!%n",
                         firstName, lastName);
        
        // Close scanner
        scanner.close();
    }
}