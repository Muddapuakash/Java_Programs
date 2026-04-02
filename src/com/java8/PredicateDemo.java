package com.java8;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		//boolean test(T t)
		Predicate<Integer> isPositive=num->num>0;
        boolean result=isPositive.test(10);
        if(result) {
        	System.out.println("Positive Number");
        }else{
            System.out.println("Negative NUmber");
        }
        
        //length checking 
        Predicate<String> isString=s-> s.length()>5;
        boolean sresult=isString.test("akash");
        if(sresult) {
        	System.out.println("valid String");
        }else {
        	System.out.println("inValid String");
        }
        
        
        //String mystring="Codegnan is good"
       // mystring.contains("is good");
        
        Predicate<String> myString=str-> str.contains("is good");
        System.out.println(myString.test("India is good"));
        
        //even or odd
        Predicate<Integer> isevenorodd=num->num%2==0;
        boolean isresult=isevenorodd.test(9);
        if(isresult) {
        	System.out.println("even number");
        }else {
        	System.out.println("odd number");
        }
        
        
        //checking two pedictae by ----and----
        Predicate<String> isvalid=isString.and(myString);
        boolean isValidPassword=isvalid.test("India is good");
        if(isValidPassword) {
        	System.out.println("valid Password");
        }else {
        	System.out.println("Not valid Password");
        }
	}

}
