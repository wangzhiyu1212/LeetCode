package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
	List<List<Integer>> out = new ArrayList<List<Integer>>();
	int[] nums;
	int target;
	public void backtrack(int index, int sum, List<Integer> list) {
		if (sum == target) {
			out.add(new ArrayList<Integer>(list));
			return;
		}
		int removed = -1;
		for (int i=index; i<nums.length; i++) {
			if (nums[i]!=removed && nums[i]+sum<=target) {
				list.add(nums[i]);
				backtrack(i+1, sum+nums[i], list);
				list.remove(list.size()-1);
				removed = nums[i];
			}
		}
		
	}
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.nums = candidates;
        this.target = target;
        Arrays.sort(nums);
        backtrack(0, 0, new ArrayList<Integer>());
        return out;
    }
	public static void main(String[] args) {
		CombinationSum2 s = new CombinationSum2();
		for(List<Integer> list: s.combinationSum2(new int[] {10,1,2,7,6,1,5}, 8))
			System.out.println(list.toString());
	}
}

