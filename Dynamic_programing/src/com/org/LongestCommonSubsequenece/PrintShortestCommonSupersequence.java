package com.org.LongestCommonSubsequenece;

public class PrintShortestCommonSupersequence {
	
	 static String printShortestSuperSeq(String X, String Y)
	    {
	        int m = X.length();
	        int n = Y.length();
	 
	        
	        int dp[][] = new int[m + 1][n + 1];
	 
	        
	        for (int i = 0; i <= m; i++)
	        {
	            for (int j = 0; j <= n; j++)
	            {
	                 
	                // Below steps follow recurrence relation
	                if (i == 0)
	                {
	                    dp[i][j] = j;
	                }
	                else if (j == 0)
	                {
	                    dp[i][j] = i;
	                }
	                else if (X.charAt(i - 1) == Y.charAt(j - 1))
	                {
	                    dp[i][j] = 1 + dp[i - 1][j - 1];
	                }
	                else
	                {
	                    dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
	                }
	            }
	        }
	 
	        
	        String str = "";
	 
	        
	        int i = m, j = n;
	        while (i > 0 && j > 0)
	         
	        {
	            // If current character in X and Y are same, then
	            // current character is part of shortest supersequence
	            if (X.charAt(i - 1) == Y.charAt(j - 1))
	             
	            {
	                // Put current character in result
	                str += (X.charAt(i - 1));
	 
	                // reduce values of i, j and index
	                i--;
	                j--;
	            }
	             
	            // If current character in X and Y are different
	            else if (dp[i - 1][j] > dp[i][j - 1])
	            {
	                 
	                // Put current character of Y in result
	                str += (Y.charAt(j - 1));
	 
	                // reduce values of j and index
	                j--;
	            }
	            else
	            {
	                 
	                // Put current character of X in result
	                str += (X.charAt(i - 1));
	 
	                // reduce values of i and index
	                i--;
	            }
	        }
	 
	        // If Y reaches its end, put remaining characters
	        // of X in the result string
	        while (i > 0)
	        {
	            str += (X.charAt(i - 1));
	            i--;
	        }
	 
	        // If X reaches its end, put remaining characters
	        // of Y in the result string
	        while (j > 0)
	        {
	            str += (Y.charAt(j - 1));
	            j--;
	        }
	 
	        // reverse the string and return it
	        str = reverse(str);
	        return str;
	    }
	 
	    static String reverse(String input)
	    {
	        char[] temparray = input.toCharArray();
	        int left, right = 0;
	        right = temparray.length - 1;
	 
	        for (left = 0; left < right; left++, right--)
	        {
	            // Swap values of left and right
	            char temp = temparray[left];
	            temparray[left] = temparray[right];
	            temparray[right] = temp;
	        }
	        return String.valueOf(temparray);
	    }
	     
	    // Driver co
	public static void main(String[] args) {
		 String X = "AGGTAB";
	        String Y = "GXTXAYB";
	        System.out.println(printShortestSuperSeq(X, Y));
	}

}
