package com.java.fundamentals;

import java.util.Scanner;

public class TemperatureConverterBi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
            System.out.printf("%.2f°C = %.2f°F%n", celsius, fahrenheit);
        } else {
            if (choice == 2) {
                System.out.print("Enter Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
                System.out.printf("%.2f°F = %.2f°C%n", fahrenheit, celsius);
            } else {
                System.out.println("Invalid choice!");
            }
        }
        
        scanner.close();
    }
}

}
