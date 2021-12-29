package com.geekyscript;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] ranks = {2, 6, 1, 8, 9};
        for(int val : ranks){
            pq.add(val);
        }

        while(pq.size() > 0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
