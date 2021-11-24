package com.wbl.oopsexamples;

public class ParamCons {
    //constructor overloading

    int id ;
    String name;
    int age;

    ParamCons(int i, String n){
        id = i;
        name = n;
    }
    ParamCons(int i, String n,int a) {
        id = i;
        name = n;
        age = a;
    }

    void display(){
        System.out.println("Id of the student " +id );
        System.out.println(" Name of the student " +name );
        System.out.println("  Age of the student " +age);
    }

    public static void main(String[] args) {
        ParamCons p1 = new ParamCons(111,"supriya");
        ParamCons p2 = new ParamCons(222,"shilpa" ,35);
        p1.display();
        p2.display();

    }
}
