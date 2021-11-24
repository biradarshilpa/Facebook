package com.wbl.abstraction;

//Example of an abstract class that has abstract and non-abstract methods
abstract class Bike{
    Bike()
    {
        System.out.println("bike is created");
    }
    abstract void run();
    void changeGear()
    {
        System.out.println("gear changed");
    }
}
//Creating a Child class which inherits Abstract class
class Honda extends Bike{
    void run()
    {
        System.out.println("running safely..");}
}



public class TestAbstraction1 {
    public static void main(String args[]){
        Honda obj= new Honda();
        obj.run();
        obj.changeGear();
    }
}

