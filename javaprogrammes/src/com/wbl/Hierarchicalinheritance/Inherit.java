package com.wbl.Hierarchicalinheritance;

public class Inherit {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Student s = new Student();
        s.display1();
        d.display2();
        t.display3();
        t.display();
    }

}
