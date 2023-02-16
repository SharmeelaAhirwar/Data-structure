

//undirected graph cycle

package com.org.detectCycleInUndirectedGraph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleUsingBFS {
	
	
	public boolean checkForCycle(ArrayList<ArrayList<Integer>>adj,int s,boolean vis[]) {
		
		Queue<Pair>q=new LinkedList<Pair>();
		
		q.add(new Pair(s,-1));
		vis[s]=true;
		
		 while(!q.isEmpty())
	       {
	           int node = q.peek().first;
	           int par = q.peek().second;
	           q.remove(); 
	           
	           for(Integer it: adj.get(node))
	           {
	               if(vis[it]==false)  
	               {
	                   q.add(new Pair(it, node));
	                   vis[it] = true; 
	               }
	        
	               else if(par != it) return true;
	           }
	       }
		
		
		
		return false;
	}
	public boolean isCycle(int vertices,ArrayList<ArrayList<Integer>>adj) {
		boolean vis[] = new boolean[vertices];
        Arrays.fill(vis,false);
        for(int i=0;i<vertices;i++)
            if(vis[i]==false) 
                if(checkForCycle(adj, i,vis)) 
                    return true;
    
        return false;
	}

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		int V=5;
		 for(int i = 0; i < V; i++)
             adj.add(i, new ArrayList<Integer>());
		 adj.get(0).add(1);
         adj.get(0).add(2);
         adj.get(2).add(3);
         adj.get(1).add(3);
         adj.get(2).add(4);
         
         

         DetectCycleUsingBFS obj = new  DetectCycleUsingBFS();
         boolean ans = obj.isCycle(V, adj);
         if(ans)
             System.out.println("Yes");
         else
             System.out.println("No");
    }
 
}


