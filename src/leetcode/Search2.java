package leetcode;

public class Search2 {
	int nums[];
	int target;
	public int searchPivot() {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i+1])
				return i;
		}
		return -1;
	}
	public boolean searchTarget(int l, int r) {
		while (l < r) {
			int mid = (l + r)/2;
			if (nums[mid] == target)
				return true;
			else if (nums[mid] > target)
				r = mid;
			else
				l = mid + 1;
		}
		if (nums[l] == target)
			return true;
		else return false;
	}
	public boolean search(int[] nums, int target) {
		if (nums.length == 0) return false;
        if (nums.length == 1) {
        	if (nums[0] == target)
        		return true;
        	else 
        		return false;
        }
        this.nums = nums;
        this.target = target;
        int pivot = searchPivot();
        if (pivot == -1)
        	return searchTarget(0, nums.length-1);
        if (target >= nums[0])
        	return searchTarget(0, pivot);
        else
        	return searchTarget(pivot+1, nums.length-1);
    }
}
/*
public static void main(String[] args) {
	Search2 s = new Search2();
	System.out.println(s.search(new int[] {2,5,6,0,0},3));
}
*/