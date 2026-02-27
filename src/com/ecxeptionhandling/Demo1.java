package com.ecxeptionhandling;

public class Demo1 {

	public static void main(String[] args) {
		try {
//			int result= 10/0;
//			
//			int[] arr= {1,2,3};
//			System.out.println(arr[2]);
			System.out.println("try Block");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("in catch block");
		}
		catch(Exception e) {
			System.out.println("in error Block");
		}
		finally {
			System.out.println("finally Block");
		}

	}

}
