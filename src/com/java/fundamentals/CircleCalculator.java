package com.java.fundamentals;

import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        double area = PI * radius * radius;
        double circumference = 2.0 * PI * radius;

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Circumference: %.2f%n", circumference);

        scanner.close();
    }

}
