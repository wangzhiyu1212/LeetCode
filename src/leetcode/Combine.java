package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combine {
	List<List<Integer>> out = new ArrayList<List<Integer>>();
	int n,k;
	public void backtrack(int index, int length, List<Integer> list) {
		if (length == k) {
			out.add(new ArrayList<Integer>(list));
			return;
		}
		for (int i = index; i <= n; i++) {
			list.add(i);
			backtrack(i+1, length+1, list);
			list.remove(list.size()-1);
		}
	}
	public List<List<Integer>> combine(int n, int k) {
		this.n = n;
		this.k = k;
        if (k > n) return out;
        backtrack(1, 0, new ArrayList<Integer>());
        return out;
    }
}
/*
Combine t = new Combine();
for(List<Integer> list:t.combine(1, 3))
	System.out.println(list.toString());
*/