package com.wbl.collections;

import java.util.Map;
import java.util.TreeMap;

public class MapTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> tree = new TreeMap<Integer,String>();
        tree.put(111,"shilpa");
        tree.put(333,"sunil");
        tree.put(222,"Aditi");
        tree.put(444,"Arohi");
        System.out.println(tree);
        for (Map.Entry m : tree.entrySet()){
            System.out.println(m.getKey() +" " +m.getValue());
        }

    }

}
