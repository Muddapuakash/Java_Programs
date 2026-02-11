package com.java.fundamentals;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate (%): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time (years): ");
        double time = scanner.nextDouble();

        double amount = principal * Math.pow(1 + rate / 100.0, time);
        double ci = amount - principal;

        System.out.printf("Compound Interest: Rs. %.2f%n", ci);
        System.out.printf("Total Amount: Rs. %.2f%n", amount);

        scanner.close();
    }

}
