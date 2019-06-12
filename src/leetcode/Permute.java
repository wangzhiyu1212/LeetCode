package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permute {
	List<List<Integer>> out = new ArrayList<List<Integer>>();
	public List<List<Integer>> permute(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		int length = nums.length;
        for (int i: nums) 
        	list.add(i);
        backtrack(list, 0, length);
		return out;
    }
	public void backtrack(List<Integer> list, int start, int length) {
		if (start == length)
			out.add(new ArrayList<Integer>(list));
		for (int i=start; i<length; i++) {
			Collections.swap(list, start, i);
			backtrack(list, start+1, length);
			Collections.swap(list, start, i);
		}
	}
}
