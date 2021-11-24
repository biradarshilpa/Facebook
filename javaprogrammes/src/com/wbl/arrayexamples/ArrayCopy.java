package com.wbl.arrayexamples;

public class ArrayCopy {
    public static void main(String[] args) {
        char[] oldarray = {'s','h','i','l','p','a','m','e','t','i'};
        char newarray[] = new char[6];

        System.arraycopy(oldarray,6,newarray,0,4);
        System.out.println(new String(newarray));
        System.out.println(String.copyValueOf(newarray));

    }
}
