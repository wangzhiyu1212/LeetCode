package leetcode;

import java.util.Arrays;

public class SearchRange {
	public int[] searchRange(int[] nums, int target) {
        int[] out = new int[] {-1,-1};
        if (nums.length == 0) return out;
        if (nums.length == 1)
        	return (nums[0] == target) ? new int[] {0,0} : out;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
        	int mid = (left + right)/2;
        	if (nums[mid] == target) {
        		out[0] = mid;
        		out[1] = mid;
        		for (int i=mid+1; i<nums.length; i++) {
        			if (nums[i] == target) 
        				out[1] = i;
        		}
        		for (int i=mid-1; i>=0; i--) {
        			if (nums[i] == target) 
        				out[0] = i;
        		}
        		return out;
        	} else if (nums[mid] > target)
        		right = mid-1;
        	else
        		left = mid+1;
        	
        }
        return out;
    }
}
/**
SearchRange s = new SearchRange();
System.out.println(Arrays.toString(s.searchRange(new int[] {5,7,7,8,8,10}, 6)));
*/