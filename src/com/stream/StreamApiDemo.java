package com.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamApiDemo{

	public static void main(String[] args) {
		//created a collection 
		List<Integer> numberList=Arrays.asList(1,2,3,4,5,6);
		
		//create a stream object by using stream method - stream()
		//numberList.stream();
		numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		System.out.println();
		List<String> nameList=
				Arrays.asList("ali","raj","Bose","Sravan","Catherine");
		
		List<String> filterdNamesList=
				nameList.stream().filter(s->s.length()>3).collect(Collectors.toList());
		
		for(String name:filterdNamesList ) {
			System.out.println(name);
		}
		
		
	}

}
