package com.java.fundamentals;
import java.util.Scanner;
public class PrimesInRange {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter range (start end): ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            } else {
                // not prime, skip
            }
        }
        
        scanner.close();
    }
    
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                } else {
                    // continue checking
                }
            }
            return true;
        }

	}

}
