package com.java.arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = {10, 25, 30, 45, 50};
        
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest: " + secondLargest);
    }
    
    private static int findSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else {
                if (arr[i] > secondLargest && arr[i] != largest) {
                    secondLargest = arr[i];
                } else {
                    // no change
                }
            }
        }
        
        return secondLargest;



	}

}
