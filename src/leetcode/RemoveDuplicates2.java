package leetcode;

public class RemoveDuplicates2 {
	public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 0;
        for (int i=1; i<nums.length; i++) {
        	if (nums[i] > nums[j]) {
        		nums[j+1] = nums[i];
        		j++;
        	} else if (nums[i] == nums[j]) {
        		if (j==0 || (j>0 && nums[j] > nums[j-1])) {
        			nums[j+1] = nums[i];
            		j++;
        		}
        	}
        }
        return j+1;
    }
}
/*
RemoveDuplicates2 r = new RemoveDuplicates2();
System.out.println(r.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
*/