package com.optional;

import java.util.Optional;

public class WithOptional {

	public static void main(String[] args) {
		String[] names=new String[5];
		names[2]="Raj";
		
		//create an Optional object
		Optional<String> optName=Optional.ofNullable(names[2]);
		//check the presence of the object
		optName.ifPresent(n->System.out.println("Name at index 2: "+names[2]));
		
		
		Optional<String> optNameAt4=Optional.ofNullable(names[4]);
		String result=optNameAt4.orElse("Default Value");
		System.out.println("Name at index 4: "+result);
		

	}

}
