package com.wbl.oopsexamples;

public class ParameterizedConstructor {

    int id;
    String name;
// parameterized constructor
    ParameterizedConstructor (int i,String n){
       id = i;
        name=n;
    }
    void display1(){
        System.out.println("id is " +id  +" name is " +name);
    }

    public static void main(String[] args) {
        ParameterizedConstructor p = new ParameterizedConstructor(1,"shilpa");
        ParameterizedConstructor p1 = new ParameterizedConstructor(2,"sowmya");
        p.display1();
        p1.display1();

    }
}
