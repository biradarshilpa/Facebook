package com.wbl.oopsexamples;

public class DefaultConstructor1 {
    int id;
    String name;

    void display(){
        System.out.println("Id is " +id +"  Name is " +name);
    }

    public static void main(String[] args) {
        DefaultConstructor1 d = new DefaultConstructor1();
        d.display();
    }
}
