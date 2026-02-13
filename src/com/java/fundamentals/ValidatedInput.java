package com.java.fundamentals;
import java.util.Scanner;
public class ValidatedInput {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int age = 0;
        boolean valid = false;
        
        while (!valid) {
            System.out.print("Enter age (1-120): ");
            
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                
                if (age >= 1 && age <= 120) {
                    valid = true;
                } else {
                    System.out.println("Invalid! Age must be 1-120.");
                }
            } else {
                System.out.println("Invalid! Enter a number.");
                scanner.next();  // Clear invalid input
            }
        }
        
        System.out.println("Valid age entered: " + age);
        
        scanner.close();

	}

}
