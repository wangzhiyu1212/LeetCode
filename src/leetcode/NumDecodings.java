package leetcode;

public class NumDecodings {
	/** ¶¯Ì¬¹æ»® */
	public int numDecodings(String s) {
		if (s.charAt(0) == '0') return 0;
		if (s.length() == 1) return 1;
		int[] dp = new int[s.length()];
		dp[0] = 1;
		if (s.charAt(1) != '0') dp[1] += 1;
		if (9 < Integer.parseInt(s.substring(0, 2)) && Integer.parseInt(s.substring(0, 2)) <27) dp[1] += 1;
		for (int i = 2; i < s.length(); i++) {
			if (s.charAt(i-1) == 0 && s.charAt(i) == 0) return 0;
			if (s.charAt(i) != '0') dp[i] += dp[i-1];
			if (9 < Integer.parseInt(s.substring(i-1, i+1)) && Integer.parseInt(s.substring(i-1, i+1)) <27) dp[i] += dp[i-2];
		}
		return dp[s.length()-1];
    }
}
/*
public static void main(String[] args) {
NumDecodings t = new NumDecodings();
System.out.println(t.numDecodings("226"));
}
*/