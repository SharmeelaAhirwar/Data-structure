
//nput : str = “geek” 
//Output : 2 
//We need to make minimum 2 cuts, i.e., “g ee k”
//Input : str = “aaaa” 
//Output : 0 
//The string is already a palindrome.
//Input : str = “abcde” 
//Output : 4
//Input : str = “abbac” 
//Output : 1 


package com.org.palindrome_partitioning;

public class PPartitioning_Recursively {
	static boolean isPalindrome(String string, int i, int j)
	  {
	    while(i < j)
	    {
	      if(string.charAt(i) != string.charAt(j))
	        return false; 
	      i++;
	      j--;
	    }
	    return true;
	  }
	
	static int minPalPartion(String string, int i, int j)
	  {   
	    if( i >= j || isPalindrome(string, i, j) )
	      return 0;
	    int ans = Integer.MAX_VALUE, count;
	    for(int k = i; k < j; k++)
	    {
	      count = minPalPartion(string, i, k) +
	        minPalPartion(string, k + 1, j) + 1;
	 
	      ans = Math.min(ans, count);
	    }
	    return ans;
	  }
	 
	public static void main(String[] args) {
		
		    String str = "ababbbabbababa";
		    System.out.println("Min cuts needed for "
		                       + "Palindrome Partitioning is " + minPalPartion(str, 0, str.length() - 1));
		  
	}

}
