package com.java.fundamentals;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        
        System.out.println("\nMultiplication Table of " + num);
        System.out.println("-------------------------");
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", num, i, num * i);
        }
        
        scanner.close();


	}

}
