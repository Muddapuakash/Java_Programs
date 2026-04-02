package com.threads;

public class FunctionalInterface {

	 public static void main(String[] args) {
	      
	        // Using lambda expression to implement Runnable
	        new Thread(() -> System.out.println("New thread created")).start();
	    }
}
