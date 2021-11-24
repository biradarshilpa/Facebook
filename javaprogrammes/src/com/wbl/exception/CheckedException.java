package com.wbl.exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedException {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println("Hello");
    }
}
