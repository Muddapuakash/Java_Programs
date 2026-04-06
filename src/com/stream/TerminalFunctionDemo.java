package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalFunctionDemo {
	//Terminal functions are used to end the pipeline
			//they trigger the execution of intermedaite functions
			//they return a result which can be a value,Collection or void.
	public static void main(String[] args) {
		
		//forEach() - its a terminal operation used to Iterate the elements
		
		List<Integer> numbers=
				Arrays.asList(100,1,300,250);
		numbers.stream().forEach(n->System.out.println(n));
		
		//collect()- is a terminal operation used to convert stream to collection
		List<Integer> numberList=numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());
		 
		System.out.println(numberList);
		
		//count()-count the elments in a collection
		long oddNumbersCount = numbers.stream().filter(n->n%2!=0).count();
		System.out.println(oddNumbersCount);
		}

}
