
//Input: arr[] = {1, 2, 3, 3}, X = 6 
//Output: 3 
//All the possible subsets are {1, 2, 3}, 
//{1, 2, 3} and {3, 3}


package com.org.subset_Problem_01Knapsack;



public class CountOfSubsetSum {
	
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
	

	public static void main(String[] args) {
		
		int n = 4;
	    int a[] = { 3, 3, 3, 3 };
	    int sum = 6;
	    System.out.print(subsetSum(a, n, sum));
	}

	

}
