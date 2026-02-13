package com.java.applications;
import java.util.Scanner;
public class ATMSimulation {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double balance = 10000.0;
        int choice;
        
        System.out.println("=== ATM MACHINE ===");
        
        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.printf("Current Balance: Rs. %.2f%n", balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.printf("Deposited: Rs. %.2f%n", deposit);
                        System.out.printf("New Balance: Rs. %.2f%n", balance);
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.printf("Withdrawn: Rs. %.2f%n", withdraw);
                        System.out.printf("New Balance: Rs. %.2f%n", balance);
                    } else {
                        if (withdraw > balance) {
                            System.out.println("Insufficient balance!");
                        } else {
                            System.out.println("Invalid amount!");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using ATM!");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
            
        } while (choice != 4);
        
        scanner.close();

	}

}
