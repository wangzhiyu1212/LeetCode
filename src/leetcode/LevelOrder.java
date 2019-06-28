package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LevelOrder {
	List<List<Integer>> out = new ArrayList<List<Integer>>();
	public void recursive(TreeNode node, int level) {
		if (node == null) return;
		if (out.size() < level + 1) out.add(new ArrayList<>());
		out.get(level).add(node.val);
		recursive(node.left, level + 1);
		recursive(node.right, level + 1);
	}
	public List<List<Integer>> levelOrder(TreeNode root) {
        recursive(root, 0);
        return out;
    }
}
