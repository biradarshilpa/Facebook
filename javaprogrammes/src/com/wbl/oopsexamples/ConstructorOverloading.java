package com.wbl.oopsexamples;

public class ConstructorOverloading {
    int id;
    String Name;
    int age;

    ConstructorOverloading (int i,String n){
         id = i;
         Name = n;
    }
    ConstructorOverloading (int i,String n,int a){
         id=i;
         Name = n;
         age = a;
    }
    void display(){
        System.out.println("Id is "+id +" Name is  " +Name +" Age is " +age);
    }

    public static void main(String[] args) {
        ConstructorOverloading c = new ConstructorOverloading(1,"shilpa",35);
        c.display();
    }
}
