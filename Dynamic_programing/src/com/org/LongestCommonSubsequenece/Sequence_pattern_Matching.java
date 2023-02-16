//Input: str1 = “AXY”, str2 = “ADXCPY”
//Output: True (str1 is a subsequence of str2)


package com.org.LongestCommonSubsequenece;

public class Sequence_pattern_Matching {

	public static void main(String[] args) {
		String s1 = "gksrek";
	    String s2 = "geeksforgeeks";
	    char[] X=s1.toCharArray(); 
	    char[] Y=s2.toCharArray(); 
	    int m = X.length; 
	    int n = Y.length; 
	    if ( lcs( X, Y, m, n ))
	        System.out.println("gksrek is subsequence of geekforgeeks");
	    else
	        System.out.println("gksrek is not a subsequence of geekforgeeks");
	}
private static boolean lcs(char[] x, char[] y, int m, int n) {
		
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
		 int lcss= L[m][n];
		 if(lcss==m)
			 return true;
		 else
			 return false;
		 
	}

}
