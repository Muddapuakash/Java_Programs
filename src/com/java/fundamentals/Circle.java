package com.java.fundamentals;
import java.util.Scanner;
public class Circle{
public static void main(String args[]){
        final double PI = 3.14159;
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = PI * radius * radius;
        System.out.println("area of the circle " + area);
        sc.close();
}
}
      