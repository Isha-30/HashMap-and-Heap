package com.geekyscript;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 135);
        map.put("Russia", 45);
        map.put("US", 25);
        map.put("UK", 20);

        System.out.println(map);

        map.put("US", 30);
        map.put("Nigeria", 10);
        System.out.println(map);

        System.out.println(map.get("India"));
        System.out.println(map.get("Utopia"));

        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Utopia"));

        Set<String> keys = map.keySet();
        System.out.println(keys);

        for(String key: map.keySet()){
            Integer val = map.get(key);
            System.out.println(key + " " + val);
        }
    }
}
