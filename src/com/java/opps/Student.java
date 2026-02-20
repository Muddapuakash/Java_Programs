package com.java.opps;

public class Student {

    // data Members 
    private String studentName;
    private int studentAge;

    // private Constructor
    private Student(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    // static Factory Method
    public static Student createStudent(String name, int age) {
        if (age > 0 && age <= 100) {
            return new Student(name, age);
        } else {
            System.out.println("Object is not created due to invalid age.");
            return null;
        }
    }

    // getter Methods
    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    // setter Methods (Optional)
    public void setStudentName(String name) {
        this.studentName = name;
    }

    public void setStudentAge(int age) {
        if (age > 0 && age <= 100) {
            this.studentAge = age;
        } else {
            System.out.println("Invalid age. Age must be between 1 and 100.");
        }
    }

    // Display method
    public void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
    }
}