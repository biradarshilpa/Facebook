package com.wbl.interfaceExamples;

interface Animal{
    public void eat(); // abstract methods
    public void sleep();
}

class pig implements Animal{
    public void eat(){
        System.out.println("pig is eating");
    }
    public void sleep(){
        System.out.println("pig is sleeping");
    }
}

class monkey implements Animal{
    public void eat(){
        System.out.println("Monkey is eating");
    }
    public void sleep(){
        System.out.println("Monkey is sleeping");
    }
}

public class SimpleInterface {
    public static void main(String[] args) {
        pig p = new pig();
        monkey m = new monkey();
        p.eat();
        p.sleep();
        m.eat();
        m.sleep();
    }
}
