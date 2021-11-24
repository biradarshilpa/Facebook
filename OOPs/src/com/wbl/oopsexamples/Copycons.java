package com.wbl.oopsexamples;

public class Copycons {
    //copy constructor
    int id ;
    String name;

    Copycons(int i,String n){
        id=i;
        name=n;
        System.out.println("Id "+id + " Name " +name);
    }
    Copycons(Copycons c){
        id= c.id;
        name = c.name;
        System.out.println("Id "+id + " Name " +name);
    }

    public static void main(String[] args) {
        Copycons c1 = new Copycons(111, "Shilpa");
        Copycons c2 = new Copycons(c1);
    }
}
