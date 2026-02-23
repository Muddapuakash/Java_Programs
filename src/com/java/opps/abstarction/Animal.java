package com.java.opps.abstarction;

abstract class Animal {
       abstract void  makesSound();
       
       public void sleeping() {
    	   System.out.println("Sleeping");
       }
}

	

class Dog extends Animal{
	public void makesSound() {
		System.out.println("barking");
	}
}


