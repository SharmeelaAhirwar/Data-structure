package com.org.disjointSet;

public class DisjointSet {
	int rank[],parent[],n;
	
	
	public DisjointSet(int N) {
		n=N;
		rank=new int[N];
		parent=new int[N];
		for (int i = 0; i < N; i++) {
            // Initially, all elements are in
            // their own set.
            parent[i] = i;
        }
	}
	int find(int x)
    {
        
        if (parent[x] != x) {
            
            parent[x] = find(parent[x]);
 
        }
 
        return parent[x];
    }
	void union(int x, int y)
    {
        // Find representatives of two sets
        int xRoot = find(x), yRoot = find(y);
 
        // Elements are in the same set, no need
        // to unite anything.
        if (xRoot == yRoot)
            return;
 
        // If x's rank is less than y's rank
        if (rank[xRoot] < rank[yRoot])
 
            // Then move x under y  so that depth
            // of tree remains less
            parent[xRoot] = yRoot;
 
        // Else if y's rank is less than x's rank
        else if (rank[yRoot] < rank[xRoot])
 
            // Then move y under x so that depth of
            // tree remains less
            parent[yRoot] = xRoot;
 
        else // if ranks are the same
        {
        	 parent[yRoot] = xRoot;
        	 
             // And increment the result tree's
             // rank by 1
             rank[xRoot] = rank[xRoot] + 1;
        }
    }
 

	public static void main(String[] args) {
		int n = 5;
        DisjointSet dus =
                new  DisjointSet(n);
 
        // 0 is a friend of 2
        dus.union(0, 2);
 
        // 4 is a friend of 2
        dus.union(4, 2);
 
        // 3 is a friend of 1
        dus.union(3, 1);
 
        // Check if 4 is a friend of 0
        if (dus.find(4) == dus.find(0))
            System.out.println("Yes");
        else
            System.out.println("No");
 
        // Check if 1 is a friend of 0
        if (dus.find(1) == dus.find(0))
            System.out.println("Yes");
        else
            System.out.println("No");
	}

}
