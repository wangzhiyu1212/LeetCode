package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	List<List<Integer>> out = new ArrayList<List<Integer>>();
	int[] candidates;
	int target;
	public void backtrack(int index, int sum, List<Integer> list) {
		if (sum == target) {
			out.add(new ArrayList<Integer>(list));
			return;
		}

		for (int i=index; i<candidates.length && candidates[i]<=target; i++) {
			if (sum + candidates[i] <= target) {
				list.add(candidates[i]);
				backtrack(i, sum + candidates[i], list);
				list.remove(list.size()-1);
			} 
		}
	}
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.target = target;
        this.candidates = candidates;
        Arrays.sort(candidates);
        backtrack(0, 0, new ArrayList<Integer>());
        return out;
    }
}
/*
CombinationSum s = new CombinationSum();
for(List<Integer> list: s.combinationSum(new int[] {2,3,6,7}, 7))
	System.out.println(list.toString());
*/