package com.java.applications;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();
        
        int a = 0, b = 1;
        int count = 0;
        
        System.out.println("Fibonacci Series:");
        
        while (count < n) {
            System.out.print(a + " ");
            
            int next = a + b;
            a = b;
            b = next;
            count++;
        }
        
        scanner.close();


	}

}
