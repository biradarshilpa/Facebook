package com.wbl.polymorphism.overriding;

public class Son extends Father{

    public void car(){
        System.out.println("son's car");
    }
    public void farm(){
        System.out.println("son's farm");
    }

    public static void main(String[] args) {
        Son s = new Son();
        s.home();
        s.car();
        s.farm();
    }
}
