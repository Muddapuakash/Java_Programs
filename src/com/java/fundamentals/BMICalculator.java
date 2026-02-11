package com.java.fundamentals;

import java.util.Scanner;

/**
 * BMI Calculator
 * Exercise 1 - Day 2
 */
public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height (m): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("Your BMI: %.2f%n", bmi);

        scanner.close();
    }
}
