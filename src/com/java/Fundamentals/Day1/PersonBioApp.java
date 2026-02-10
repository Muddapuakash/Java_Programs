package com.java.Fundamentals;
import java.util.Scanner;
// general practise - reverse of the domain for eg, codegnan.com becomes com.codegnan
/*
A program to collect users Biographical information and  display the details in formatted manner
*/


public class PersonBioApp{
//main Method
 public static void main(String args[]){

   // Object Creation Syntax: ClassName refvar = new ClassName();
   /* Create a Scanner Object for Keyboard input*/

   Scanner sc=new Scanner(System.in);
   //Display
   System.out.println("====================================");
   System.out.println("   Personal Biographical Profile    ");
   System.out.println("====================================");
   System.out.println();
   System.out.print("Please enter Your full Name: ");
   String Name = sc.nextLine();
   System.out.print("Please enter Your  Age: ");
   int age = sc.nextInt();
   sc.nextLine();
   System.out.print("Please enter Your  City: ");
   String city = sc.nextLine();
   System.out.print("Please enter Your Proffesion: ");
   String Proff = sc.nextLine();
   System.out.print("Please enter Your Salary: ");
   float sal = sc.nextFloat();
   System.out.println();
   System.out.println("====================================");
   System.out.println("          Displaying Data           ");
   System.out.println("====================================");
   System.out.println();
   System.out.println("your Name is " + Name +".");
   System.out.println("your Age is " + age +".");
   System.out.println("your City is " + city +".");
   System.out.println("your Proffesion is " + Proff +".");
   System.out.println("your Salary is " + sal +".");

 }
}
