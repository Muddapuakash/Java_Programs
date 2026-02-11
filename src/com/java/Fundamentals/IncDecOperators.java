package com.java.fundamentals;

public class IncDecOperators{
   public static void main(String args[]){
     int var1 = 10;
     int var2 = var1++; //post increment
     int var3 = ++var1;  //pre increment
     int var4 = var1--;  //post decrement
     int var5 = --var1;  //pre increment
     System.out.println(var2); //10
     System.out.println(var1); //10
     System.out.println(var3); //12
     System.out.println(var4); //12
     System.out.println(var5); //10
}
}