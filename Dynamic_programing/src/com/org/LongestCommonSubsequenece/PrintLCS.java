package com.org.LongestCommonSubsequenece;

public class PrintLCS {
	
private static void lcs(char[] x, char[] y, int m, int n) {
		
		int L[][] = new int[m+1][n+1]; 
		
		 for (int i=0; i<=m; i++) 
		    { 
		    for (int j=0; j<=n; j++) 
		    { 
		        if (i == 0 || j == 0) 
		            L[i][j] = 0; 
		        else if (x[i-1] == y[j-1]) 
		            L[i][j] = L[i-1][j-1] + 1; 
		        else
		            L[i][j] = Math.max(L[i-1][j], L[i][j-1]); 
		         }
		    }
		 
		 int index = L[m][n];
	        int temp = index;
	 
	        // Create a character array to store the lcs string
	        char[] lcs = new char[index + 1];
	        lcs[index]
	            = '\u0000'; 
	        int i = m;
	        int j = n;
	        while(i>0 && j>0) {
	        	if(x[i-1]==y[j-1]) {
	        		 lcs[index - 1] = x[i - 1];
	        		 
	                 // reduce values of i, j and index
	                 i--;
	                 j--;
	                 index--;
	        	}
	        	else if (L[i - 1][j] > L[i][j - 1])
	                i--;
	            else
	                j--;
	        }
	        
	        System.out.print("LCS  is ");
   for (int k = 0; k <= temp; k++)
       System.out.print(lcs[k]);
}
	public static void main(String[] args) {
		 String s1 = "AGGTAB"; 
		    String s2 = "GXTXAYB"; 
		  
		    char[] X=s1.toCharArray(); 
		    char[] Y=s2.toCharArray(); 
		    int m = X.length; 
		    int n = Y.length; 
		  
		    System.out.println("longest common subsequence is :"); 
		    lcs( X, Y, m, n );

	}

}
