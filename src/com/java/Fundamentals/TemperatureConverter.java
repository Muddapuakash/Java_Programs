package com.java.Fundamentals;

import java.util.Scanner;

/**
 * Temperature Converter
 * Exercise 4 - Day 1
 * 
 * Converts Celsius to Fahrenheit.
 * 
 * Demonstrates:
 * - Decimal arithmetic
 * - Type casting considerations
 * - Special characters in output
 * 
 * @author Codegnan IT Solutions
 * @version 1.0
 */
public class TemperatureConverter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read Celsius temperature
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Convert to Fahrenheit
        // Use 9.0 and 5.0 to ensure double division
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        
        // Display result with degree symbols
        System.out.printf("%.2f°C = %.2f°F%n", celsius, fahrenheit);
        
        // Close scanner
        scanner.close();
    }
}