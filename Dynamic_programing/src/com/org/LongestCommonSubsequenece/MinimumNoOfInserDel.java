
//Input : 
//str1 = "heap", str2 = "pea" 
//Output : 
//Minimum Deletion = 2 and
//Minimum Insertion = 1
//Explanation:
//p and h deleted from heap
//Then, p is inserted at the beginning
//One thing to note, though p was required yet
//it was removed/deleted first from its position and
//then it is inserted to some other position.
//Thus, p contributes one to the deletion_count
//and one to the insertion_count.

package com.org.LongestCommonSubsequenece;

public class MinimumNoOfInserDel {

	
	static int lcs(String str1, String str2, int m, int n)
    {
        int L[][] = new int[m + 1][n + 1];
        int i, j;
 
        for (i = 0; i <= m; i++) {
            for (j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
 
                else if (str1.charAt(i - 1)
                         == str2.charAt(j - 1))
                    L[i][j] = L[i - 1][j - 1] + 1;
 
                else
                    L[i][j] = Math.max(L[i - 1][j],
                                       L[i][j - 1]);
            }
        }
 
        
        return L[m][n];
    }
 
    
	static void printMinDelAndInsert(String str1, String str2) {
		int m = str1.length();
		int n = str2.length();

		int len = lcs(str1, str2, m, n);

		System.out.println("Minimum number of " + "deletions = ");
		System.out.println(m - len);

		System.out.println("Minimum number of " + "insertions = ");
		System.out.println(n - len);
}
	public static void main(String[] args) {
		String str1 = new String("heap");
        String str2 = new String("pea");
       
         
        printMinDelAndInsert(str1, str2);
	}

}
