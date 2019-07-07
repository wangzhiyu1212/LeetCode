package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumTotal {
	public int minimumTotal(List<List<Integer>> triangle) {
		if (triangle.size() == 0) return 0;
		List<Integer> list = new ArrayList<Integer>();
        int length = triangle.size();
        int[] pre = new int[length];
        int[] dp;
        pre[0] = triangle.get(0).get(0);
        for (int i = 1; i < length; i++) {
        	dp = new int[length];
        	list = triangle.get(i);
        	int len = list.size();
        	dp[0] = pre[0] + list.get(0);
        	for (int j = 1; j < len - 1; j++) {
        		dp[j] = Math.min(pre[j-1], pre[j]) + list.get(j);
        	}
        	dp[len-1] = pre[len-2] + list.get(len-1);
        	pre = dp;
        }
        int min = pre[0];
        for (int i = 1; i < length; i++)
        	min = Math.min(min, pre[i]);
        return min;
    }
}
/*
public static void main(String[] args) {
List<List<Integer>> list = new ArrayList<List<Integer>>();
list.add(new ArrayList<Integer>(Arrays.asList(2)));
list.add(new ArrayList<Integer>(Arrays.asList(3,4)));
list.add(new ArrayList<Integer>(Arrays.asList(6,5,7)));
list.add(new ArrayList<Integer>(Arrays.asList(4,1,8,3)));
MinimumTotal m = new MinimumTotal();
System.out.println(m.minimumTotal(list));
}
*/