package com.java.applications;
import java.util.Scanner;
public class NumberClassifier {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Check Prime (using for loop)
        boolean isPrime = checkPrime(num);
        
        // Check Perfect (using while loop)
        boolean isPerfect = checkPerfect(num);
        
        // Check Armstrong (using do-while loop)
        boolean isArmstrong = checkArmstrong(num);
        
        // Display results
        System.out.println("\n===== CLASSIFICATION REPORT =====");
        System.out.println("Number: " + num);
        System.out.println("Prime: " + (isPrime ? "YES" : "NO"));
        System.out.println("Perfect: " + (isPerfect ? "YES" : "NO"));
        System.out.println("Armstrong: " + (isArmstrong ? "YES" : "NO"));
        
        scanner.close();
    }
    
    private static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                } else {
                    // continue
                }
            }
            return true;
        }
    }
    
    private static boolean checkPerfect(int n) {
        int sum = 0;
        int i = 1;
        
        while (i < n) {
            if (n % i == 0) {
                sum += i;
            } else {
                // not a divisor
            }
            i++;
        }
        
        return sum == n;
    }
    
    private static boolean checkArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        int temp = n;
        
        do {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        } while (temp > 0);
        
        return sum == original;

	}

}
