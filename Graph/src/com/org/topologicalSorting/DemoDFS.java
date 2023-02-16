package com.org.topologicalSorting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class DemoDFS {
    // No. of vertices
    private int V;
 
    // Adjacency List as ArrayList of ArrayList's
    private ArrayList<ArrayList<Integer> > adj;
 
    // Constructor
    DemoDFS(int v)
    {
        V = v;
        adj = new ArrayList<ArrayList<Integer> >(v);
        for (int i = 0; i < v; ++i)
            adj.add(new ArrayList<Integer>());
    }

	void addEdge(int v, int w) {
		adj.get(v).add(w);
	}
	
	public void topologicalUtil(int node,boolean vis[],Stack<Integer>st) {
		vis[node]=true;
		Integer i;
		 // Recur for all the vertices adjacent
        // to thisvertex
        Iterator<Integer> it = adj.get(node).iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!vis[i])
                topologicalUtil(i, vis, st);
        }
 
        // Push current vertex to stack
        // which stores result
        st.push(new Integer(node));
    }
	
	public void topologicalSort() {
		Stack<Integer> st=new Stack<Integer>();
		boolean visited[]=new boolean[V];
		for(int i=0;i<V;i++) {
			visited[i]=false;
		}
		for(int i=0;i<V;i++) {
			if(visited[i]==false) {
				topologicalUtil(i,visited,st);
			}
		}
		while(st.empty()==false)
			System.out.print(st.pop() + " ");
	}

	public static void main(String[] args) {
		 DemoDFS g = new DemoDFS(6);
	        g.addEdge(5, 2);
	        g.addEdge(5, 0);
	        g.addEdge(4, 0);
	        g.addEdge(4, 1);
	        g.addEdge(2, 3);
	        g.addEdge(3, 1);
	 
	        System.out.println("Following is a Topological "
	                           + "sort of the given graph");
	        // Function Call
	        g.topologicalSort();
	}

}
