package com.wbl.stringexamples;

public class StringsMethods {
    public static void main(String[] args) {
    String s1 = "java";
    String s2 = "java";
    String s3 = new String("java");
    String s4 = new String("java");
    String s5 = " world ";
        System.out.println(s1==s2);// checks the reference
        System.out.println(s3==s4);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1.equals(s2));// checks the content
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s3));
        System.out.println(s1.concat(s5));
        System.out.println(s1+s5);
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(3,4));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s5.trim());
        System.out.println(s1.startsWith("We"));
        System.out.println(s1.endsWith("e"));
        System.out.println(s1.charAt(3));
        System.out.println(s1.length());
       // System.out.println(s5.replace("Home","Come"));
        System.out.println(s1.compareTo(s2));
       // System.out.println(s1.compareTo(s3));
       // System.out.println(s1.compareTo(s5));



}
}
