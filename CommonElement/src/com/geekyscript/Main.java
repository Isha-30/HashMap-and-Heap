package com.geekyscript;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array1: ");
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        System.out.print("Enter elements of array1: ");
        for(int i = 0; i<a1.length; i++)
            a1[i] = sc.nextInt();

        System.out.print("Enter the size of array2: ");
        int n2 = sc.nextInt();
        int[] a2 = new int[n1];
        System.out.print("Enter elements of array2: ");
        for(int i = 0; i<a2.length; i++)
            a2[i] = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int val : a1){
            if(map.containsKey(val)){
                int prev = map.get(val);
                int curr = prev+1;
                map.put(val, curr);
            }
            else{
                map.put(val, 1);
            }
        }

        for(int val : a2){
            if(map.containsKey(val)){
                System.out.println(val);
                map.remove(val);
            }
        }
    }
}
