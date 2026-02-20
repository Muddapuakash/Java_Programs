package com.java.arrays;
import java.util.Scanner;         
public class CountOccurrences {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        
        System.out.print("Enter element: ");
        int element = scanner.nextInt();
        
        int count = countOccurrences(arr, element);
        System.out.println(element + " appears " + count + " times");
        
        scanner.close();
    }
    
    private static int countOccurrences(int[] arr, int element) {
        int count = 0;
        for (int num : arr) {
            if (num == element) {
                count++;
            } else {
                // continue
            }
        }
        return count;


	}

}
