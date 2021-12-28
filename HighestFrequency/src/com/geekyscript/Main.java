package com.geekyscript;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                int old = map.get(ch);
                int curr = old+1;
                map.put(ch, curr);
            }
            else{
                map.put(ch, 1);
            }
        }

        char max = str.charAt(0);
        for(Character key : map.keySet()){
            if(map.get(key) > map.get(max)){
                max = key;
            }
        }

        System.out.println("Highest freq is of key "+ max + " with value "+ map.get(max));
    }
}
