package com.java.fundamentals;

import java.util.Scanner;
public class GradeDescription {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter grade (A/B/C/D/F): ");
        char grade = scanner.next().charAt(0);
        
        String description;
        
        switch (grade) {
            case 'A':
            case 'a':
                description = "Excellent! Outstanding performance.";
                break;
            case 'B':
            case 'b':
                description = "Very Good! Above average performance.";
                break;
            case 'C':
            case 'c':
                description = "Good! Average performance.";
                break;
            case 'D':
            case 'd':
                description = "Satisfactory! Needs improvement.";
                break;
            case 'F':
            case 'f':
                description = "Fail! Must work harder.";
                break;
            default:
                description = "Invalid grade entered.";
                break;
        }
        
        System.out.println(description);
        
        scanner.close();


	}

}
