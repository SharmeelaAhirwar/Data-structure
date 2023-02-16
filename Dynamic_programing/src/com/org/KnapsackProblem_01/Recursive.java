package com.org.KnapsackProblem_01;

public class Recursive {
	
	public static int knapSack(int W,int[] wt, int []val, int n) {
		if(n==0 || W==0)
			return 0;
		
		if(wt[n-1]>W)
			 return knapSack(W, wt, val, n - 1);
		else {
			 return Math.max(val[n-1] + knapSack(W - wt[n - 1],
                    wt, val, n - 1),
     knapSack(W, wt, val, n - 1));
		}
		
	}

	public static void main(String[] args) {
		 int val[] = { 60, 100, 120 };
		    int wt[] = { 10, 20, 30 };
		    int W = 50;
		    int n=val.length;
		    int maxProfit=knapSack(W, wt, val, n);
		    System.out.println("maximum profit :"+maxProfit);

	}

}
