package leetcode;

public class MaxProfit {
	/** 一次交易 */
	public int maxProfit(int[] prices) {
		if (prices.length == 0) return 0;
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
        	min = Math.min(prices[i], min);
        	max = Math.max(max, prices[i] - min);
        }
        return max;
    }
	
	/** 多次交易 */
	public int maxProfit2(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
        	if (prices[i] > prices[i-1])
        		max += prices[i] - prices[i-1];
        }
        return max;
    }
	
	public int maxProfit3(int[] prices) {
		int max = 0;
		
		return max;
	}
}
/*
public static void main(String[] args) {
MaxProfit t = new MaxProfit();
System.out.println(t.maxProfit(new int[] {7,2,9,1,4}));
}
*/