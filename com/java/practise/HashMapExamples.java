package com.java.practise;

import java.util.*;

public class HashMapExamples {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Tea", 15);
        hashMap.put("Coffee", 25);
        hashMap.put("Lemon Tea", 35);
        System.out.println(hashMap);
        //   hashMap.remove("Coffee");
        //  System.out.println(hashMap.size());
        //  System.out.println(hashMap.isEmpty());
        // hashMap.clear();
        // System.out.println(hashMap);

        //Iterating on HashMaps;

        Set<String> keySet = hashMap.keySet();
        System.out.println(keySet);

        for (String key : keySet) {
            System.out.println("Key = " + key + " \t : Value = " + hashMap.get(key));
        }

    }

}
