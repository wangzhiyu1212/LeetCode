package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
	List<List<Integer>> out = new ArrayList<List<Integer>>();
	public void recursive(TreeNode root, int target, List<Integer> list) {
		if (root == null) return;
		int sum = target - root.val;
		list.add(root.val);
		if (root.left == null && root.right == null) {
			if (sum == 0)
				out.add(new ArrayList<Integer>(list));
			list.remove(list.size() - 1);
			return;
		}
		recursive(root.left, sum, list);
		recursive(root.right, sum, list);
		list.remove(list.size() - 1);
	}
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
        recursive(root, sum, new ArrayList<Integer>());
		return out;
    }
}
