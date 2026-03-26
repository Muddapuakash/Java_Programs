package com.collections;

public class Demo {
	public static void meth3() {
		System.out.println("Meth3 Called");
		System.out.println("Meth3 exited");
	}
	public static void meth2() {
		System.out.println("Meth2 Called");
		meth3();
		
		
		System.out.println("Meth2 exited");
	}
	
	public static void meth1() {
		System.out.println("Meth1 Called");
		meth2();
		System.out.println("Meth1 exited");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
        meth1();
        System.out.println("Main Method Exited");
	}

}
