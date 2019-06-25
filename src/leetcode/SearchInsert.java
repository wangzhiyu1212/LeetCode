package leetcode;

public class SearchInsert {
	public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        if (nums.length == 1)
        	return (nums[0] >= target) ? 0 : 1;
        if (target < nums[0]) return 0;
        if (target > nums[nums.length-1]) return nums.length;
        int left = 0, right = nums.length - 1;
        while (left < right) {
        	int mid = (left + right)/2;
        	if (nums[mid] == target) 
        		return mid;
        	else if (nums[mid] > target)
        		right = mid;
        	else
        		left = mid + 1;
        }
        return left;
    }
}
/*
SearchInsert s = new SearchInsert();
System.out.println(s.searchInsert(new int[] {1,3,5,8}, 7));
*/