package leetcode;

public class Jump {
	public int jump(int[] nums) {
		if (nums.length == 0) return 0;
        int start=0, len=0, count=0, maxl=0;
        while (len < nums.length - 1) {
        	for (int i = start; i <= len ; i++) {
        		maxl = Math.max(maxl, i + nums[i]);
        	}
        	start = len + 1;
        	len = maxl;
        	count ++;
        }
        return count;
    }
}
/*
Jump t = new Jump();
System.out.println(t.jump(new int[] {2,3,1,1,4}));
*/