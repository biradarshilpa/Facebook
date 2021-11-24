package com.wbl.inheritanceexamples;

public class EngineeringStudent extends Student {
    String branch = "Computerscience";
       //int id = 10;
    int marks = 500;
     public static void main(String[] args) {
          EngineeringStudent e = new EngineeringStudent();
          e.display();
          System.out.println(e.name);
          System.out.println(e.age);
          System.out.println(e.city);
          e.display1();
          System.out.println(e.id);
         System.out.println("marks from engineering subchild class");
         System.out.println(e.branch);
         System.out.println(e.marks);
     }
}
