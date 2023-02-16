
//Input: N = 4, arr[] = [5, 2, 6, 4], diff = 3
//Output: 1
//Explanation: We can only have a single partition which is shown below:
//{5, 2} and {6, 4} such that S1 = 7 and S2 = 10 and thus the difference is 3

package com.org.subset_Problem_01Knapsack;

public class CountOfsubsetDifference {

	private static int subsetSum(int[] a, int n, int sum) {
		int tab[][] = new int[n + 1][sum + 1];
		 
	    // Initializing the first value of matrix
	    tab[0][0] = 1;
	 
	    for(int i = 1; i <= sum; i++)
	        tab[0][i] = 0;
	 
	 
	    for(int i = 1; i <= n; i++)
	    {
	        for(int j = 0; j <= sum; j++)
	        {
	             
	            // If the value is greater than the sum
	            if (a[i - 1] > j)
	                tab[i][j] = tab[i - 1][j];
	 
	            else
	            {
	                tab[i][j] = tab[i - 1][j] +
	                            tab[i - 1][j - a[i - 1]];
	            }
	        }
	    }
	 
	    return tab[n][sum];
	}
	

	private static int diffSum(int[] arr, int n, int d) {
		int totalSum=0;
		for(int i=0;i<n;i++) {
			totalSum=totalSum+arr[i];
		}
		
		
		int s1=(totalSum+d)/2;
		return subsetSum(arr, n, s1);
		
		
	}
	public static void main(String[] args) {
		int arr[]= {1,1,2,3};
		int n=arr.length;
		int d=1;
		int coūnt=diffSum(arr,n,d);
		System.out.println(coūnt);
	}

	

}
