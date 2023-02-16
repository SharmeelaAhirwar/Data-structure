package com.org.topologicalSorting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DemoBFSKanhsAlgo {

	
	 public boolean isCyclic(int N, ArrayList<ArrayList<Integer>> adj) {
		 int top[]=new int[N];
		 int indegree[]=new int[N];
		 
		 //finding indegree
		 for(int i = 0;i<N;i++) {
             for(Integer it: adj.get(i)) {
                 indegree[it]++;
             }
           }
		 Queue<Integer>q=new LinkedList<Integer>();
		 for(int i=0;i<N;i++) {
			 if(indegree[i]==0)
				 q.add(i);
		 }
		 int index=0;
		 int count=0;
		 while(!q.isEmpty()) {
			 Integer node=q.poll();
			 top[index++]=node;
			 count++;
			 for(Integer it:adj.get(node)) {
				 indegree[it]--;
				 if(indegree[it]==0)
					 q.add(it);
			 }
			 
		 }
		 for (int i=0;i< top.length;i++){
             System.out.print(top[i]+" ");
         }
         if(count == N) 
        	 return false;
         else
        	 
         return true;
     
	 }
	public static void main(String[] args) {
		 
	            ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();

	            // adding new arraylists to 'adj' to add neighbour nodes
	            for (int i = 0; i < 6; i++) {
	                adj.add(new ArrayList < > ());
	            }


	            adj.get(5).add(2);
	            adj.get(5).add(0);
	            adj.get(4).add(0);
	            adj.get(4).add(1);
	            adj.get(3).add(1);
	            adj.get(2).add(3);


	           new DemoBFSKanhsAlgo().isCyclic(6,adj);
	}

}
