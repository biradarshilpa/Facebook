package com.wbl.oopsexamples;

public class InitByReference {

    int id ;
    String name;

}

class Student{
    public static void main(String[] args) {
        InitByReference i1 = new InitByReference();
        i1.id= 101;
        i1.name = "Shilpa";
        System.out.println(i1.id);
        System.out.println(i1.name);
    }
}
