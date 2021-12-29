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
        for(int val: arr){
            pq.add(val);
        }
        System.out.println("Enter val of K: ");
        int k = sc.nextInt();
        while(pq.size()>(n-k)){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
