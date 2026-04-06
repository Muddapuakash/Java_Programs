package com.java.opps;

class ExceptionExample {
	// Method declaring checked exception using 'throws'
	static void validate(int age) throws Exception {
	if (age < 18) {
	// throwing an exception explicitly
	throw new Exception("Age must be 18 or above");
	}
	System.out.println("Eligible to vote");
	}
	public static void main(String[] args) {
	try {
	validate(15); // risk of exception
	int result = 10/0; // arithmetic exception
	System.out.println("Result: " + result);
	}
	catch (ArithmeticException e) {
	System.out.println("Cannot divide by zero: " + e.getMessage());
	}
	catch (Exception e) {
	System.out.println("Exception occurred: " + e.getMessage());
	}
	finally {
	System.out.println("Finally block executed");
	}
	}
	}
