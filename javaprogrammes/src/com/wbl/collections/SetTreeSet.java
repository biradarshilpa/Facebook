package com.wbl.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTreeSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("ball");
        ts.add("cat");
        ts.add("apple");
        //ts.add(null);
        ts.add("apple");
        ts.add("");
        ts.add("dog");
        Iterator it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }








    }
}
