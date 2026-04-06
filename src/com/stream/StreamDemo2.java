package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamDemo2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();   // number of elements
    int k = sc.nextInt();   // elements to skip

    List<Integer> list = new ArrayList<>();

    // Read input elements
    for (int i = 0; i < n; i++) {
        list.add(sc.nextInt());
    }

    // Skip first k elements (lazy) and collect result (eager)
    List<Integer> result = list.stream()
                               .skip(k)
                               .collect(Collectors.toList());

    // Convert list to space-separated string
    String output = result.stream()
                          .map(String::valueOf)
                          .collect(Collectors.joining(" "));

    // Print final output
    System.out.print(output);
}
}
