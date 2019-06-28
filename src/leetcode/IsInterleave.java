package leetcode;

public class IsInterleave {
	/** 递归(时效较差) */
	public boolean backtrack(String s1, String s2, String s3, int p1, int p2, int p3) {
		if (p1 == s1.length() && p2 == s2.length() && p3 == s3.length())
			return true;
		if (p1 < s1.length() && p3 < s3.length() && s1.charAt(p1) == s3.charAt(p3)) {
			if (backtrack(s1, s2, s3, p1+1, p2, p3+1))
				return true;
		}
		if (p2 < s2.length() && p3 < s3.length() && s2.charAt(p2) == s3.charAt(p3)) {
			if (backtrack(s1, s2, s3, p1+1, p2, p3+1))
				return true;
		}
		return false;
	}
	
	/** 动态规划 */
	public boolean isInterleave(String s1, String s2, String s3) {
		if (s1.length() + s2.length() != s3.length()) return false;
		boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
		
		for (int i = 0; i <= s1.length(); i++) {
			for (int j = 0; j <= s2.length(); j++) {
				if (i == 0 && j == 0) {
					dp[i][j] = true;
				} else if (i == 0) {
					dp[i][j] = dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1);
				} else if (j == 0) {
					dp[i][j] = dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1);
				} else {
					dp[i][j] = (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1)) 
							|| (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1));
				}
			}
		}
		return dp[s1.length()][s2.length()];
    }
	
}
/*
public static void main(String[] args) {
IsInterleave t = new IsInterleave();
System.out.println(t.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
}
*/