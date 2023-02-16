package com.org.minmumSpanningTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Nodes{
	private int u;
    private int v;
    private int weight;
    
    Nodes(int _u, int _v, int _w) { u = _u; v = _v; weight = _w; }
    
    Nodes() {}
    
    int getV() { return v; }
    int getU() { return u; }
    int getWeight() { return weight; }
}

class SortComparator implements Comparator<Nodes> {
	@Override
    public int compare(Nodes nodes1, Nodes nodes2) 
    { 
        if (nodes1.getWeight() < nodes2.getWeight()) 
            return -1; 
        if (nodes1.getWeight() > nodes2.getWeight()) 
            return 1; 
        return 0; 
   

    } 
} 
public class KrushkalAlgo {
	
	private int findPar(int u, int parent[]) {
		if(u==parent[u])
			return u;
		return parent[u] = findPar(parent[u], parent); 
	}
	private void union(int u, int v, int parent[], int rank[]) {
		u = findPar(u, parent); 
		v = findPar(v, parent);
		if(rank[u] < rank[v]) {
        	parent[u] = v;
        }
        else if(rank[v] < rank[u]) {
        	parent[v] = u; 
        }
        else {
        	parent[v] = u;
        	rank[u]++; 
        }
	}
	
	 void KruskalAlgo(ArrayList<Nodes> adj, int N)
	    {
	        Collections.sort(adj, new SortComparator());
	        int parent[] = new int[N]; 
	        int rank[] = new int[N];

	        for(int i = 0;i<N;i++) {
	        	parent[i] = i; 
	        	rank[i] = 0; 
	        }

	        int costMst = 0;
	        ArrayList<Nodes> mst = new ArrayList<Nodes>();
	        for(Nodes it: adj) {
	        	if(findPar(it.getU(), parent) != findPar(it.getV(), parent)) {
	        		costMst += it.getWeight(); 
	        		mst.add(it); 
	        		union(it.getU(), it.getV(), parent, rank); 
	        	}
	        } 
	        System.out.println(costMst);
	        for(Nodes it: mst) {
	        	System.out.println(it.getU() + " - " +it.getV()); 
	        }
	    }

	public static void main(String[] args) {
		int n = 5;
        ArrayList<Nodes> adj = new ArrayList<Nodes>();
		
			
		adj.add(new Nodes(0, 1, 2));
		adj.add(new Nodes(0, 3, 6));
		adj.add(new Nodes(1, 3, 8));
		adj.add(new Nodes(1, 2, 3));
		adj.add(new Nodes(1, 4, 5));
		adj.add(new Nodes(2, 4, 7));

	
		KrushkalAlgo obj = new KrushkalAlgo(); 
		obj.KruskalAlgo(adj, n);

	}

}
