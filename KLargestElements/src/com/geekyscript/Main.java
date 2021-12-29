package com.geekyscript;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    PriorityQueue<Integer> pq = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of K: ");
        int k = sc.nextInt();
        for(int i =0; i< n; i++){
            if(i<k){
                pq.add(arr[i]);
            }
            else{
                if(arr[i] > pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }

        while(pq.size() > 0)
            System.out.println(pq.remove());
    }
}
