package com.wbl.oopsexamples;

public class account {
    //Object and Class Example: Initialization through method
    int acc_no;
    String name;
    float amt;

    void insertDetails(int a, String n, float m) {
        acc_no = a;
        name = n;
        amt = m;

    }

    void display() {
        System.out.println(acc_no);
        System.out.println(name);
        System.out.println(amt);

    }

    void deposit(float amount) {
        amt = amt + amount;
        System.out.println("deposited amount " + amount);
    }

    void withDraw(float amount) {
        if (amt < amount) {
            System.out.println("insufficient amount");
        } else {
            amt = amt - amount;
            System.out.println("withdrawn amount" + amount);
        }
    }


    public static void main(String[] args) {
        account a = new account();
        a.insertDetails(111,"shilpa",10000);
        a.display();
        a.deposit(20000);
        a.display();
        a.withDraw(15000);
        a.display();

    }
}