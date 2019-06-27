package leetcode;


public class NumTrees {
	/**
	 * ��ǩ����̬�滮
	 * ����n���ڵ���ڶ����������ĸ�����G(n)����f(i)Ϊ��iΪ���Ķ����������ĸ�������
	 * G(n) = f(1) + f(2) + f(3) + f(4) + ... + f(n)
	 * ��iΪ���ڵ�ʱ�����������ڵ����Ϊi-1�����������ڵ�Ϊn-i����
	 * f(i) = G(i-1)*G(n-i)
	 * �ۺ�������ʽ���Եõ�����������ʽ
	 * G(n) = G(0)*G(n-1)+G(1)*(n-2)+...+G(n-1)*G(0) 
	 */
	public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
        	for (int j = 1; j <= i; j++) {
        		dp[i] += dp[j-1]*dp[i-j];
        	}
        }
        return dp[n];
    }
}
/*
public static void main(String[] args) {
NumTrees t = new NumTrees();
System.out.println(t.numTrees(3));
}
*/