package com.org.dijakstraAlgo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int n = 5;
        ArrayList<ArrayList<Pair> > adj = new ArrayList<ArrayList<Pair> >();
		
		for (int i = 0; i < n; i++) 
			adj.add(new ArrayList<Pair>());
			
		adj.get(0).add(new Pair(1, 2));
		adj.get(1).add(new Pair(0, 2));
		
		adj.get(1).add(new Pair(2, 4));
		adj.get(2).add(new Pair(1, 4));
		
		adj.get(0).add(new Pair(3, 1));
		adj.get(3).add(new Pair(0, 1));
		
		adj.get(3).add(new Pair(2, 3));
		adj.get(2).add(new Pair(3, 3));
		
		adj.get(1).add(new Pair(4, 5));
		adj.get(4).add(new Pair(1, 5));
		
		adj.get(2).add(new Pair(4, 1));
		adj.get(4).add(new Pair(2, 1));
		
		DijakstraALgo obj = new DijakstraALgo(); 
		obj.shortestPath(0, adj, n); 
		
    }

	}


