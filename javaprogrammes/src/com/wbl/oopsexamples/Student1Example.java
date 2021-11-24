package com.wbl.oopsexamples;

public class Student1Example {
    //main method outside the class
    int id;
    String name;
}

     class TestStudent{
         public static void main(String[] args) {
             Student1Example s1 = new Student1Example();
             System.out.println(s1.id);
             System.out.println(s1.name);

         }

}
