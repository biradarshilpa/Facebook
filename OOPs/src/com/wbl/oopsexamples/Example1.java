package com.wbl.oopsexamples;

public class Example1 {
        int data=50;

        void change(int data){
            data=data+100;//changes will be in the local variable only
            //System.out.println("before change "+data);

        }

        public static void main(String args[]){
            Example1 op=new Example1();

            System.out.println("before change "+op.data);
            op.change(500);
            System.out.println("after change "+op.data);

        }
    }

