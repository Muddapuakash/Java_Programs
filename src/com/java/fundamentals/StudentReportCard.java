package com.java.fundamentals;

import java.util.Scanner;

/**
 * Student Report Card
 * Exercise 6 - Day 1
 * 
 * Comprehensive student marks management system.
 * 
 * Demonstrates:
 * - Mixed data types (String + int)
 * - Scanner buffer handling
 * - Calculations
 * - Professional report formatting
 */
public class StudentReportCard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect student information
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // ✅ Consume newline

        // Collect marks
        System.out.print("Enter marks in Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int subject3 = scanner.nextInt();

        // Calculate total and average
        int total = subject1 + subject2 + subject3;
        double average = total / 3.0;

        // Display report card
        System.out.println();
        System.out.println("===== STUDENT REPORT CARD =====");
        System.out.printf("Name: %s%n", studentName);
        System.out.printf("Roll Number: %d%n", rollNumber);
        System.out.printf("Subject 1: %d%n", subject1);
        System.out.printf("Subject 2: %d%n", subject2);
        System.out.printf("Subject 3: %d%n", subject3);
        System.out.println("-------------------------------");
        System.out.printf("Total: %d%n", total);
        System.out.printf("Average: %.2f%%%n", average);

        // Close scanner
        scanner.close();
    }
}
