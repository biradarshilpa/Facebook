package com.wbl.oopsexamples;

class Adder {
    // we are creating static methods so that we don't need to create instance for calling methods.
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}
    class OverLoadingAddition1{
    public static void main(String[] args) {
        System.out.println(Adder.add(10,10));
        System.out.println(Adder.add(10,10,10));

    }
}



