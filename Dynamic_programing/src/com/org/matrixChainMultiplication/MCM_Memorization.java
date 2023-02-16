package com.org.matrixChainMultiplication;

import java.util.Arrays;

public class MCM_Memorization {

	static int matrixChainMemoised(int[] p, int i, int j,int dp[][])
	  {
	    if (i == j) 
	    {
	      return 0;
	    }
	    if (dp[i][j] != -1) 
	    {
	      return dp[i][j];
	    }
	    dp[i][j] = Integer.MAX_VALUE;
	    for (int k = i; k < j; k++) 
	    {
	      dp[i][j] = Math.min(
	        dp[i][j], matrixChainMemoised(p, i, k,dp)
	        + matrixChainMemoised(p, k + 1, j,dp)
	        + p[i - 1] * p[k] * p[j]);
	    }
	    return dp[i][j];
	  }
	 
	 
	static int matrixMultiplication(int[] arr, int N){
	    
	    int dp[][]= new int[N][N];
	    
	    for(int row[]:dp)
	    Arrays.fill(row,-1);
	    
	    int i =1;
	    int j = N-1;
	    
	    
	    return matrixChainMemoised(arr,i,j,dp);
	    
	    
	}

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4};
		
		int n = arr.length;
		
		System.out.println("The minimum number of operations are "+
	        matrixMultiplication(arr,n));
	}

}
