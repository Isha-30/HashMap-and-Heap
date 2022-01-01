package com.geekyscript;

public class Pair implements Comparable<Pair>{
    int li;
    int di;
    int val;

    Pair(int li, int di, int val){
        this.li = li;
        this.di = di;
        this.val = val;
    }
    public int compareTo(Pair o){
        return this.val - o.val;
    }
}
