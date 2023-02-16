package com.org.detectCycleInUndirectedGraph;

//undirected Graph
import java.util.ArrayList;
import java.util.Iterator;

public class DetectCycleUsingDFS {
	private int V;
	private ArrayList<Integer> adj[];
	public DetectCycleUsingDFS(int vertices) {
		V=vertices;
		adj=new ArrayList[vertices];
		for(int i=0;i<vertices;i++) {
			adj[i]=new ArrayList<Integer>();
		}
	}
	public void addEdge(int v,int w) {
		adj[v].add(w);
		adj[w].add(v);
	}
	public boolean isCyclic() {
		boolean vis[]=new boolean[V];
		for(int i=0;i<V;i++) {
			vis[i]=false;
		}
		for(int j=0;j<V;j++) {
			if(!vis[j]) {
				if (isCyclicUtil(j, vis, -1))
                    return true;
			}
		}
		return false;
	}
	public boolean isCyclicUtil(int node,boolean vis[],int par) {
		
		vis[node]=true;
		Integer i;
		Iterator<Integer> it = adj[node].iterator();
		while(it.hasNext()) {
			i=it.next();
			 if (!vis[i]) {
	                if (isCyclicUtil(i, vis, node))
	                    return true;
	            }
			 else if(i!=par)
				 return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		 DetectCycleUsingDFS g1 = new DetectCycleUsingDFS(5);
	        g1.addEdge(1, 0);
	        g1.addEdge(0, 2);
	        g1.addEdge(2, 1);
	        g1.addEdge(0, 3);
	        g1.addEdge(3, 4);
	        if (g1.isCyclic())
	            System.out.println("Graph contains cycle");
	        else
	            System.out.println("Graph doesn't contain cycle");
	        
	        DetectCycleUsingDFS g2 = new DetectCycleUsingDFS(3);
	        g2.addEdge(0, 1);
	        g2.addEdge(1, 2);
	        if (g2.isCyclic())
	            System.out.println("Graph contains cycle");
	        else
	            System.out.println("Graph doesn't contain cycle");
	    }
	 
	}


