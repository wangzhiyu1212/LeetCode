package leetcode;

public class MaxSubArray {
	public int maxSubArray(int[] nums) {
		if (nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i=1; i<nums.length; i++) {
        	dp[i] = dp[i-1] + nums[i];
        	if (dp[i] < nums[i]) {
        		dp[i] = nums[i];
        	} 
        }
        for (int i=0; i<dp.length; i++) {
        	max = Math.max(max, dp[i]);
        }
        return max;
    }
}
/*
MaxSubArray t = new MaxSubArray();
System.out.println(t.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
*/
