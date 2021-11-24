package com.wbl.arrayexamples;

public class TestArray {
    public static void main(String[] args) {
        int[] a;
        a= new int[5];
        a[0]= 10;
        a[1]= 20;
        a[2]= 30;
        a[3]= 40;
        a[4]= 50;

        int [] b ={60,70,80,90};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println("--------------");

        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("--------------");
        for (int aa:a){
            System.out.println(aa);
        }
    }


}
