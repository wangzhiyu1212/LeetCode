package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	List<List<Integer>> out = new ArrayList<List<Integer>>();
	int[] nums;
	int n;
	public void backtrack(int index, int length, int k, List<Integer> list) {
		if (length == k) {
			out.add(new ArrayList<Integer>(list));
			return;
		}
		for (int i = index; i < n; i++) {
			list.add(nums[i]);
			backtrack(i+1, length+1, k, list);
			list.remove(list.size()-1);
		}
	}
	public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        n = nums.length;
        for (int i = 0; i <= nums.length; i++) {
        	backtrack(0, 0, i, new ArrayList<Integer>());
        }
        return out;
    }
}
/*
Subsets t = new Subsets();
for(List<Integer> list:t.subsets(new int[] {1,2,3}))
	System.out.println(list.toString());
*/