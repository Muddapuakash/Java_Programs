package com.methods;


//Problem: Create Circle class with radius.
//Add methods to calculate area, circumference, and diameter.

public class Circle {
	double radius;
    final double PI = 3.14159;
    
    public double calculateArea() {
        return PI * radius * radius;
    }
    
    public double calculateCircumference() {
        return 2 * PI * radius;
    }
    
    public double calculateDiameter() {
        return 2 * radius;
    }
    
    public void displayInfo() {
        System.out.println("===== CIRCLE INFO =====");
        System.out.println("Radius: " + radius);
        System.out.printf("Area: %.2f%n", calculateArea());
        System.out.printf("Circumference: %.2f%n", calculateCircumference());
        System.out.printf("Diameter: %.2f%n", calculateDiameter());
        System.out.println("=======================");
    }
    
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 7.0;
        
        circle.displayInfo();
    }

}
