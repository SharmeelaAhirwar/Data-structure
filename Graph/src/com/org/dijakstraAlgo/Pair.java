package com.org.dijakstraAlgo;

import java.util.Comparator;



public class Pair implements Comparator < Pair > {
    private int v;
    private int weight;

    Pair(int _v, int _w) {
        v = _v;
        weight = _w;
    }

    Pair() {}

    int getV() {
        return v;
    }
    int getWeight() {
        return weight;
    }

    @Override
    public int compare(Pair node1, Pair node2) {
        if (node1.weight < node2.weight)
            return -1;
        if (node1.weight > node2.weight)
            return 1;
        return 0;
    }
}