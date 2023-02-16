package com.org.minmumSpanningTree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

class Pair implements Comparator < Pair > {
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
public class PrimsOptimizeAlgo {
	public void primsAlgo(ArrayList<ArrayList<Pair>> adj, int N) {
		int key[] = new int[N];
        int parent[] = new int[N];
        boolean mstSet[] = new boolean[N];
        for (int i = 0; i < N; i++) {
            key[i] = 100000000;
            mstSet[i] = false;
        }

        PriorityQueue <Pair > pq = new PriorityQueue < Pair > (N, new Pair());

        key[0] = 0;
        parent[0] = -1;
        pq.add(new Pair(key[0], 0));
        
        while (!pq.isEmpty()) {
            int u = pq.poll().getV();
            mstSet[u] = true;

            for (Pair it: adj.get(u)) {
                if (mstSet[it.getV()] == false && it.getWeight() < key[it.getV()]) {
                    parent[it.getV()] = u;
                    key[it.getV()] = it.getWeight();
                    pq.add(new Pair(it.getV(), key[it.getV()]));
                }
            }
        }

        for (int i = 1; i < N; i++) {
            System.out.println(parent[i] + " - " + i);
        }
    }
	

	public static void main(String[] args) {
		 int n = 5;
	        ArrayList < ArrayList < Pair > > adj = new ArrayList < ArrayList < Pair> > ();

	        for (int i = 0; i < n; i++)
	            adj.add(new ArrayList < Pair > ());

	        adj.get(0).add(new Pair(1, 2));
	        adj.get(1).add(new Pair(0, 2));

	        adj.get(1).add(new Pair(2, 3));
	        adj.get(2).add(new Pair(1, 3));

	        adj.get(0).add(new Pair(3, 6));
	        adj.get(3).add(new Pair(0, 6));

	        adj.get(1).add(new Pair(3, 8));
	        adj.get(3).add(new Pair(1, 8));

	        adj.get(1).add(new Pair(4, 5));
	        adj.get(4).add(new Pair(1, 5));

	        adj.get(2).add(new Pair(4, 7));
	        adj.get(4).add(new Pair(2, 7));

	        PrimsOptimizeAlgo obj = new PrimsOptimizeAlgo();
	        obj.primsAlgo(adj, n);

	    }

	

	}


