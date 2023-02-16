package com.org.DFS;

import java.util.ArrayList;
import java.util.Iterator;

import com.org.BFS.GraphBFS;

public class GraphDFS {

	private int v;
	ArrayList<Integer> adj[];
	 private boolean visited[];
	public GraphDFS(int noOfVer) {
		v=noOfVer;
		adj=new ArrayList[noOfVer];
		for(int i=0;i<noOfVer;i++) {
			adj[i]=new ArrayList<Integer>();
			 visited=new boolean[v];
		}
	}
	
	public void addEdge(int v,int w) {
		adj[v].add(w);
	}
	void DFS(int vertex) {
		
	    visited[vertex] = true;
	    System.out.print(vertex + " ");

	    Iterator<Integer> ite = adj[vertex].listIterator();
	    while (ite.hasNext()) {
	      int adj = ite.next();
	      if (!visited[adj])
	        DFS(adj);
	    }
	  }
	//DFs for disconnected graph
	
	public ArrayList<Integer>dfsGraph(int v,ArrayList<ArrayList<Integer>>adj){
		ArrayList<Integer>storeDFS=new ArrayList<Integer>();
		boolean vis[]=new boolean[v];
		for(int i=1;i<=v;i++) {
			if(vis[i] == false) {
				dfs(i,vis,adj,storeDFS);
			}
		}
		return storeDFS;
	}
	public void dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>>adj,ArrayList<Integer>storeDFS) {
		storeDFS.add(node);
		vis[node]=true;
		for(Integer it:adj.get(node)) {
			if(vis[it]==false)
				dfs(it,vis,adj,storeDFS);
		}
	}
	public static void main(String[] args) {

		GraphDFS g = new GraphDFS(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.DFS(2);
	}

}
