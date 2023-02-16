
//Input : aebcbda
//Output : 2

package com.org.LongestCommonSubsequenece;

public class MinimumNoOfDelInStrToMakePalindrome {

private static int lcs(char[] x, char[] y, int m, int n) {
		
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
		return L[m][n]; 
	}
	public static void main(String[] args) {
		String s1= "aebcbda";
		String s2="";
		char ch;
		for (int i=0; i<s1.length(); i++)
	      {
	        ch= s1.charAt(i); //extracts each character
	        s2= ch+s2; //adds each character in front of the existing string
	      }
		 char[] X=s1.toCharArray(); 
		    char[] Y=s2.toCharArray(); 
	      
	    
        int m = s1.length();
        int n=s2.length();
        int len= lcs( X, Y, m, n );
        int minimumNoOfDel=m-len;
        System.out.println("minimumNoOfDel = "+ minimumNoOfDel);

	}

}
