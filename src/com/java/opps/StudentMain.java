package com.java.opps;

public class StudentMain {

    public static void main(String[] args) {

     
        Student s1 = Student.createStudent("Akash", 22);

        if (s1 != null) {
            s1.displayStudentDetails();

            
            System.out.println("Access using Getter:");
            System.out.println("Name: " + s1.getStudentName());
            System.out.println("Age: " + s1.getStudentAge());
        }

        System.out.println(" ");

        //using method
        Student s2 = Student.createStudent("Ramu", 87);

        if (s2 != null) {
            s2.displayStudentDetails();
        }
    }
}