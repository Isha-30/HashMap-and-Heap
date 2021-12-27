package com.geekyscript;
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
    }
}
