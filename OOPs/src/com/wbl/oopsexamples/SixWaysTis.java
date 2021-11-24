package com.wbl.oopsexamples;

public class SixWaysTis {
// to refer current class instance variable
    int roll_no;
    String name;
    int age;
    SixWaysTis(int roll_no,String name,int age) {
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;


    }
   void display(){
        System.out.println(roll_no +" " +name +" "+age);
    }

    public static void main(String[] args) {
        SixWaysTis t1 = new SixWaysTis(1,"shilpa",30);
        SixWaysTis t2 = new SixWaysTis(2,"sowmya",25);
        t1.display();
        t2.display();
    }
}

    //this: to invoke current class method
/*void m(){
    System.out.println("In method m");
}
void n(){
    System.out.println("In method n");
    this.m();
    m(); // compiler will add this keyword while invoking this method automatically.
}

    public static void main(String[] args) {
        SixWaysTis t1 = new SixWaysTis();
        t1.n();
    }

    //this() : to invoke current class constructor
    //Calling default constructor from parameterized constructor:

SixWaysTis(){
    this(5);
    System.out.println("Default constructor");

}
SixWaysTis(int a){
    this(); // calls a default constructor from parameterized constructor
    System.out.println("parametrized constructor "+a);

}

    public static void main(String[] args) {
        SixWaysTis t1 = new SixWaysTis();
    }
}*/