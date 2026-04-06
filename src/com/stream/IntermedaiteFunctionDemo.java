package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntermedaiteFunctionDemo {
	public static void main(String[] args) {
		 //filter() - selects the elements based on a condition
		
		List<Integer> numbers=
				Arrays.asList(100,1,300,250);
		
		List<Integer> evenNumbers=numbers.stream().filter(n->n%2==0)
				.collect(Collectors.toList());
		
		System.out.println(evenNumbers);
		
		
		//map: map() is used to transform each element
		
		List<String> namesList=
				Arrays.asList("ali","raj","bode","catherine");
		
		List<String> filterednames=namesList.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(filterednames);
		
		//sort() is used to sort the elements 
		
		List<Integer> sortedList=numbers.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(sortedList);
		
		List<Integer> reversesortedList=numbers.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(reversesortedList);
		
		
		//distint - removes duplicates
		List<Integer> uniqueNUmbers=numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueNUmbers);
		
		
		//limit - restricts the number of elements
		List<Integer> limited=numbers.stream().limit(3).collect(Collectors.toList());
		System.out.println(limited);
		
		List<Integer> result=numbers.stream().filter(n->n%2==0).distinct().map(n->n*10).sorted().collect(Collectors.toList());
		System.out.println(result);
		}
      
}

