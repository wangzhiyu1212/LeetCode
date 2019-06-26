package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsWithDup {
	List<List<Integer>> out = new ArrayList<List<Integer>>();
	int[] nums;
	public void backtrack(int index, int length, int k, List<Integer> list) {
		if (length == k) {
			out.add(new ArrayList<Integer>(list));
			return;
		}
		for (int i = index; i < nums.length; i++) {
			if (i > index && nums[i] == nums[i-1]) continue;
			list.add(nums[i]);
			backtrack(i+1, length+1, k, list);
			list.remove(list.size()-1);
		}
	}
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		this.nums = nums;
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length; i++) {
        	backtrack(0, 0, i, new ArrayList<Integer>());
        }
        return out;
    }
}
/*
public static void main(String[] args) {
SubsetsWithDup t = new SubsetsWithDup();
for(List<Integer> list:t.subsetsWithDup(new int[] {1,2,2,3}))
	System.out.println(list.toString());
}
*/