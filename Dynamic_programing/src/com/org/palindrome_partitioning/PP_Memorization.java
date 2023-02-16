package com.org.palindrome_partitioning;

import java.util.Arrays;

public class PP_Memorization {

	public static int checkPalindrome(String s, int start, int end) {
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return 0;
			}
			start++;
			end--;
		}
		return 1;
	}

	public static int minimumCuts(String s, int i, int j, int[][] dp) {
		  if (checkPalindrome(s, i, j) == 1 || i >= j) {
		    dp[i][j] = 0;
		    return dp[i][j];
		  }
		  if (dp[i][j] != -1) {
		    return dp[i][j];
		  }
		  int answer = Integer.MAX_VALUE;
		  int countCuts = -1;
		  for (int k = i; k < j; k++) {
		    countCuts = minimumCuts(s, i, k, dp) + minimumCuts(s, k + 1, j, dp);
		    countCuts += 1;
		    answer = Math.min(answer, countCuts);
		  }
		  dp[i][j] = answer;
		  return dp[i][j];
	}

	 static int getMinCuts(String s) {
		int n = s.length();
		int[][] dp = new int[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			Arrays.fill(dp[i], -1);
		}
		return minimumCuts(s, 0, n - 1, dp);
	}

	public static void main(String[] args) {
		String str = "ababbbabbababa";
		System.out.println("Min cuts needed for " + "Palindrome Partitioning is " + getMinCuts(str));

	}

}
