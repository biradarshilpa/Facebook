package com.wbl.oopsexamples;

public class StudentExample {
//main method inside the class
    int id; //instance variable or data member
    String name;

    public static void main(String[] args) {
        StudentExample s1 = new StudentExample();// creating an object or instance
        System.out.println(s1.id); //accessing member through reference variable
        System.out.println(s1.name);

    }
}
