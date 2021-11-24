package com.wbl.oopsexamples;

public class DefCon1 {

    int id;
    String name;

    DefCon1(int i,String n){
        id = i;
        name = n;
    }

    void display(){
        System.out.println("Student id is " +id +" Student name " +name);
    }

    public static void main(String[] args) {
        DefCon1 d1 = new DefCon1(11,"shilpa");
        DefCon1 d2 = new DefCon1(22, "supriya");
        d1.display();
        d2.display();
    }
}
