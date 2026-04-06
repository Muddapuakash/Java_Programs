package com.optional;

public class Demo {
	void greet(String name) {

		System.out.println(name + " Have a good day");
	}

	static void greetPerson(String name) {

		System.out.println(name + " Have a good day");
	}

	public static void main(String[] args) {

		
		 Greeting myGreeting=(n)->System.out.println(n+", ! hello");
		  myGreeting.sayHello("Raj");
		 
        //instance refernce
		Demo demo = new Demo();
		Greeting myGreeting1 = demo::greet;  
		myGreeting1.sayHello("raj");
        
		
		//static method refrence
		Greeting myGreeting2 = Demo::greetPerson;
		myGreeting2.sayHello("Prasanth");
	}
}
