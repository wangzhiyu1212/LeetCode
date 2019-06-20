package leetcode;

public class MinDistance {
	public int minDistance(String word1, String word2) {
		int n = word1.length();
	    int m = word2.length();

	    if (n * m == 0)
	      return n + m;

	    int [][] dp = new int[n + 1][m + 1];

	    for (int i = 0; i < n + 1; i++) {
	      dp[i][0] = i;
	    }
	    for (int j = 0; j < m + 1; j++) {
	      dp[0][j] = j;
	    }
	    
	    for (int i = 1; i < n + 1; i++) {
	    	for (int j = 1; j < m + 1; j++) {
	    		int l = dp[i-1][j];
	    		int d = dp[i][j-1];
	    		int ld;
	    		if (word1.charAt(i-1) == word2.charAt(j-1))
	    			ld = dp[i-1][j-1] - 1; 
	    		else
	    			ld = dp[i-1][j-1]; 
	    		dp[i][j] = 1 + Math.min(l, Math.min(d, ld));
	    	}
	    }
	    return dp[n][m];
    }
}
/*
MinDistance t = new MinDistance();
System.out.println(t.minDistance("horse", "ros"));
*/