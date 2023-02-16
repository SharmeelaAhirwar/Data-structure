package com.org.KnapsackProblem_01;

public class Memorization {
	
	static int knapSackRec(int W, int wt[],int val[], int n,int [][]dp) {
		if(W==0|| n==0)
			return 0;
		if (dp[n][W] != -1)
	        return dp[n][W];  
		if (wt[n - 1] > W)  
		     
	        // Store the value of function call  
	        // stack in table before return
	        return dp[n][W] = knapSackRec(W, wt, val,
	                                      n - 1, dp);
	                                       
	    else
	     
	        // Return value of table after storing 
	        return dp[n][W] = Math.max((val[n - 1] +
	                              knapSackRec(W - wt[n - 1], wt,
	                                          val, n - 1, dp)),
	                              knapSackRec(W, wt, val,
	                                          n - 1, dp)); 
		
	}
	 static int knapSack(int W, int wt[], int val[], int n) {
		
		int dp[][] = new int[n + 1][W + 1];
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<W+1; j++) {
				dp[i][j]=-1;
			}
		}
		return knapSackRec(W, wt, val, n, dp);
	}

	public static void main(String[] args) {
		int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));


	}

}
