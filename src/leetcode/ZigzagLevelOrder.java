package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ZigzagLevelOrder {
	List<List<Integer>> out = new ArrayList<List<Integer>>();
	public void recursive(TreeNode node, int level) {
		if (node == null) return;
		if (out.size() < level + 1) out.add(new LinkedList<>());
		if (level % 2 == 0)
			out.get(level).add(node.val);
		else
			out.get(level).add(0, node.val);
		recursive(node.left, level + 1);
		recursive(node.right, level + 1);
	}
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
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
ZigzagLevelOrder l = new ZigzagLevelOrder();
for(List<Integer> list : l.zigzagLevelOrder(t1))
	System.out.println(list.toString());
}
*/