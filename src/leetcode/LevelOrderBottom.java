package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelOrderBottom {
	List<List<Integer>> out = new ArrayList<List<Integer>>();
	List<List<Integer>> reverse = new LinkedList<List<Integer>>();
	public void recursive(TreeNode node, int level) {
		if (node == null) return;
		if (out.size() < level + 1) out.add(new ArrayList<>());
		out.get(level).add(node.val);
		recursive(node.left, level + 1);
		recursive(node.right, level + 1);
	}
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        recursive(root, 0);
        for (List<Integer> list : out)
        	reverse.add(0, list);
        return reverse;
    }	
}
