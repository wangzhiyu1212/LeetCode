package leetcode;

import java.util.Arrays;
import java.util.List;

public class CodeTest {

	public static void main(String[] args) {
		CombinationSum s = new CombinationSum();
		for(List<Integer> list: s.combinationSum(new int[] {2,3,5}, 8))
			System.out.println(list.toString());
	}
}
