package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Read entire line of strings
        String[] arr = sc.nextLine().split(" ");

        // Convert strings to lengths using map()
        List<Integer> result = Arrays.stream(arr)
                                     .map(String::length) // lazy
                                     .collect(Collectors.toList()); // eager

        // Convert to space-separated output
        String output = result.stream()
                              .map(String::valueOf)
                              .collect(Collectors.joining(" "));

        System.out.print(output);

	}

}
