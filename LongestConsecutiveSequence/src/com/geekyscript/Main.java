package com.geekyscript;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n1 = sc.nextInt();
        int[] arr = new int[n1];
        System.out.print("Enter elements of array: ");
        for(int i = 0; i<arr.length; i++)
            arr[i] = sc.nextInt();

        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int val : arr)
            map.put(val, true);

        for(int val : arr){
            if(map.containsKey(val-1)) {
                map.put(val, false);
            }
        }

        int msp = 0; // max starting point
        int ml = 0; //max length
        for(int val : arr){
            if(map.get(val)==true){
                int tl = 1; // temporary length
                int tsp = val; // temporary start point

                while(map.containsKey(tsp+tl)){
                    tl++;
                }

                if(tl > ml){
                    msp = tsp;
                    ml = tl;
                }
            }
        }

        for(int i = 0; i<ml; i++){
            System.out.println(msp+i);
        }
    }
}
