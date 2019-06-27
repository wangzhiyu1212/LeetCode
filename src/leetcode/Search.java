package leetcode;

public class Search {
	public int searchPivot(int[] nums, int left, int right) {
		if (nums[left] < nums[right])
			return -1;
		
		while (left <= right) {
			int pivot = (left + right)/2;
			if (nums[pivot] > nums[pivot+1])
				return pivot;
			if (nums[pivot] < nums[left]) {
				right = pivot-1;
			} else 
				left = pivot+1;
		}
		return 0;
		
	}
	public int searchTarget(int[] nums, int left, int right, int target) {
		while (left <= right) {
			int pivot = (left + right)/2;
			if (nums[pivot] == target)
				return pivot;
			if (nums[pivot] > target) {
				right = pivot-1;
			} else 
				left = pivot+1;
		}
		return -1;
		
	}
	public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) {
        	if (nums[0] == target)
        		return 0;
        	else 
        		return -1;
        }
        int pivot = searchPivot(nums,0,nums.length-1);
        if (pivot != -1 && target == nums[pivot])
        	return pivot;
        if (pivot == -1)
        	return searchTarget(nums,0,nums.length-1,target);
        if (target >= nums[0])
        	return searchTarget(nums,0,pivot,target);

        return searchTarget(nums,pivot+1,nums.length-1,target);
    }
}
/*
Search s = new Search();
System.out.println(s.search(new int[] {1,3},3));
*/