package com.java.arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 4, 5};
        
        int newLength = removeDuplicates(arr);
        
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    private static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else {
            // continue
        }
        
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            } else {
                // skip duplicate
            }
        }
        
        return j + 1;


	}

}
