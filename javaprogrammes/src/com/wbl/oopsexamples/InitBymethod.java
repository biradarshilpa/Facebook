package com.wbl.oopsexamples;

public class InitBymethod {
    int id;
    String name;

    void insert(int id ,String name){
        id= id;
        name=name;
    }
    void display(){
        System.out.println( "id is " +id +"name is " +name) ;
    }

}

class Student1{
    public static void main(String[] args) {
        InitBymethod i2 = new InitBymethod();
        i2.insert(11,"Shilpa");
        i2.display();


    }
}
