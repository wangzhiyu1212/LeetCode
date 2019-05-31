package leetcode;

public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 0;
        for (int i=1; i<nums.length; i++) {
        	if (nums[i] > nums[j]) {
        		nums[j+1] = nums[i];
        		j++;
        	}
        }
        return j+1;
    }
}
/**
RemoveDuplicates r = new RemoveDuplicates();
System.out.println(r.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
*/