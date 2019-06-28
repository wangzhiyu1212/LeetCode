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
/*
public static void main(String[] args) {
TreeNode t1 = new TreeNode(3);
TreeNode t2 = new TreeNode(20);
t1.left = new TreeNode(9);
t1.right = t2;
t2.left = new TreeNode(15);
t2.right = new TreeNode(7);
LevelOrder l = new LevelOrder();
for(List<Integer> list : l.levelOrder(t1))
	System.out.println(list.toString());
}
*/