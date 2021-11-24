package com.wbl.oopsexamples;

public class PrintName {
    public static void main(String[] args) {
        String name = "Shilpa";
        /*for (int i=0;i< name.length() ;i++){
            System.out.println(name.charAt(i));
        }*/
        int i=0;
        while(name.length()>=0){
            //System.out.println("length of name"+name.length());
            System.out.println(name.charAt(i));
            i++;
        }
    }
}
