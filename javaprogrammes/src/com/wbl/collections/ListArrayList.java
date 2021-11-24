package com.wbl.collections;

import javafx.beans.binding.ListExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ListArrayList {
    public static void main(String[] args) {

        ArrayList city = new ArrayList();//creating arraylist
        System.out.println(city.isEmpty());
        System.out.println("ordered,allows duplicates,multiple null values");
        city.add("Sfo");
        city.add("Chicago");
        city.add("");
        city.add(null);
        city.add("Austin");
        city.add("Atlanta");
        city.add("Austin");
        city.add(null);
        System.out.println(city.size());
        System.out.println(city);
        city.remove(4);
        //System.out.println(city);
        //Collections.sort(city);
        System.out.println("------------");
        System.out.println(city);
        //By using for loop

        for (int i=0;i< city.size();i++){
            System.out.println(city.get(i));
        }
        System.out.println("------------");
        //By using iterator
        Iterator itr = city.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }
        city.set(3,"florida");
        System.out.println(city);
        System.out.println("------------");

        //By for each loop
        for ( Object st : city)

            System.out.println(st);
        }








    }



