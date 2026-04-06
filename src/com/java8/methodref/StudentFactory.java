package com.java8.methodref;

@FunctionalInterface
public interface StudentFactory {
    
	Student create(String name);
}
