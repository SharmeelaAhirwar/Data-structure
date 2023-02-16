package com.org.dijakstraAlgo;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijakstraALgo {
	void shortestPath(int s, ArrayList<ArrayList<Pair>> adj, int N)
    {
        int dist[] = new int[N];
        
        for(int i = 0;i<N;i++) dist[i] = 100000000;
        dist[s] = 0; 
        
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(N, new Pair());
        pq.add(new Pair(s, 0));
        
        while(pq.size() > 0) {
        	Pair node = pq.poll();
            
            for(Pair it: adj.get(node.getV())) {
                if(dist[node.getV()] + it.getWeight() < dist[it.getV()]) {
                    dist[it.getV()] = dist[node.getV()] + it.getWeight(); 
                    pq.add(new Pair(it.getV(), dist[it.getV()]));
                }
            }
        }
        System.out.println("The distances from source "+s+" are : ");
        for (int i = 0; i < N; i++)
        {
            System.out.print( dist[i] + " ");
        }
    }
}
