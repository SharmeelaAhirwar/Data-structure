package com.org.BFS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {
	private int v;
	ArrayList<Integer> adj[];
	public GraphBFS(int noOfVer) {
		v=noOfVer;
		adj=new ArrayList[noOfVer];
		for(int i=0;i<noOfVer;i++) {
			adj[i]=new ArrayList<Integer>();
		}
	}
	
	public void addEdge(int v,int w) {
		adj[v].add(w);
	}
	
//	Bfs for connected graph
	public void BFS(int s) {
		boolean vis[] = new boolean[v];
		Queue<Integer>q=new LinkedList<Integer>();
		vis[s]=true;
		q.add(s);
		while(!q.isEmpty()) {
			s=q.poll();
			System.out.println(s+" ");
			 Iterator<Integer> i = adj[s].listIterator();
	            while (i.hasNext())
	            {
	                int n = i.next();
	                if (!vis[n])
	                {
	                    vis[n] = true;
	                    q.add(n);
	                }
	            }
		}
	}
	
	
//	BFS for disconnected graph
	public ArrayList<Integer>BFS(int v,ArrayList<ArrayList<Integer>>adj){
		ArrayList<Integer>bfs=new ArrayList<Integer>();
		boolean vis[]=new boolean[v+1];
		for(int i=1;i<=v;i++) {
			if(vis[i]==false) {
				Queue<Integer>q=new LinkedList<Integer>();
				q.add(i);
				vis[i]=true;
				while(!q.isEmpty()) {
					Integer node=q.poll();
					bfs.add(node);
					for(Integer it:adj.get(node)) {
						if(vis[it]==false) {
							vis[it]=true;
							q.add(it);
						}
					}
				}
			}
		}
		return bfs;
	}

	public static void main(String[] args) {
		
		
		GraphBFS g = new GraphBFS(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.BFS(2);
		
	}

}
