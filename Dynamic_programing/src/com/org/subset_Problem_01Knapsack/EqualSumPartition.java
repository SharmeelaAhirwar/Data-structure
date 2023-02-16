
//Partition problem is to determine whether a given set can be partitioned into two subsets such that the sum of elements in both subsets is the same. 
//
//Examples: 
//
//arr[] = {1, 5, 11, 5}
//Output: true 
//The array can be partitioned as {1, 5, 5} and {11}
//
//arr[] = {1, 5, 3}
//Output: false 

package com.org.subset_Problem_01Knapsack;

public class EqualSumPartition {
	private static boolean subsetSum(int[] arr, int sum, int n) {
		boolean dp[][]=new boolean[n+1][sum+1];
		
		for(int i=0;i<=n;i++) {
			dp[0][i]=false;
		}
		for(int i=0;i<=n;i++) {
			dp[i][0]=true;
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sum;j++) {
				if(arr[i-1]<=j) {
					dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
				}
				else
				{
					dp[i][j]=dp[i-1][j];
					
				}
			}
		}
		
		
		return dp[n][sum];
	}
	private static boolean findPartiion(int[] arr, int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		if(sum%2!=0)
			return false;
		
		else
			return subsetSum(arr, sum/2, n);
			
		
	}


	public static void main(String[] args) {
		int arr[] = { 3, 1, 5, 9, 12 };
        int n = arr.length;
        if (findPartiion(arr, n) == true)
            System.out.println("Can be divided into two subsets of equal sum");
        else
            System.out.println("Can not be divided into two subsets of equal sum");
 
        int arr2[] = { 3, 1, 5, 9, 14 };
        int n2 = arr2.length;
 
        if (findPartiion(arr2, n2) == true)
            System.out.println("Can be divided into two subsets of equal sum");
        else
            System.out.println("Can not be divided into two subsets of equal sum");
    }

	
}
