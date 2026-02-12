package com.java.fundamentals;

import java.util.Scanner;

public class VoteEligible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter u r Age: ");
		
		if(sc.hasNextInt()) {
			int age=sc.nextInt();
			if(age>18) {
				System.out.println("Eligible for Voting");
			}
			else {
				System.out.println("Not Eligible for Voting");
			}	
		}else {
			System.out.println("Enter Valid Input");
		}
		
		   

	}

}
