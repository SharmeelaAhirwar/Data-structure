
//Input : X = �GeeksforGeeks�, y = �GeeksQuiz� 
//Output : 5 
//Explanation:
//The longest common substring is �Geeks� and is of length 5.
//
//Input : X = �abcdxyz�, y = �xyzabcd� 
//Output : 4 
//Explanation:
//The longest common substring is �abcd� and is of length 4.


package com.org.longestCommonSubstring;

public class LCSubstring {

	 static int LCSubStr(char X[], char Y[],
             int m, int n) {
		int LCStuff[][] = new int[m + 1][n + 1];

		int result = 0;

//
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					LCStuff[i][j] = 0;
				else if (X[i - 1] == Y[j - 1]) {
					LCStuff[i][j] = LCStuff[i - 1][j - 1] + 1;
					result = Integer.max(result, LCStuff[i][j]);
				} else
					LCStuff[i][j] = 0;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String X = "OldSite:GeeksforGeeks.org";
		String Y = "NewSite:GeeksQuiz.com";

		int m = X.length();
		int n = Y.length();

		System.out.println(LCSubStr(X.toCharArray(), Y.toCharArray(), m, n));

	}

}
