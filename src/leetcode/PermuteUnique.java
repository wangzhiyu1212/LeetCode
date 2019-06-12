package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermuteUnique {
	List<List<Integer>> out = new ArrayList<List<Integer>>();
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		int length = nums.length;
		Arrays.sort(nums);
        for (int i: nums) 
        	list.add(i);
        backtrack(list, 0, length);
		return out;
    }
	public void backtrack(List<Integer> list, int start, int length) {
		if (start == length)
			out.add(new ArrayList<Integer>(list));
		out:for (int i=start; i<length; i++) {
			for (int j=start; j<i; j++) {
				if (list.get(j).equals(list.get(i)))
					continue out;
			}
			Collections.swap(list, start, i);
			backtrack(list, start+1, length);
			Collections.swap(list, start, i);
		}
	}
}
