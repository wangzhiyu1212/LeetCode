package leetcode;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
public class InorderTraversal {
	/** ¶þ²æÊ÷ÖÐÐò±éÀú */
	List<Integer> out = new ArrayList<Integer>();
	public List<Integer> inorderTraversal(TreeNode root) {
		if (root == null) return out;
		recursive(root);
		return out;
	}
	public void recursive(TreeNode head) {
		if (head.left != null)
			recursive(head.left);
		out.add(head.val);
		if (head.right != null)
			recursive(head.right);
	}
	public static void print(TreeNode head) {
		if (head.left != null)
			print(head.left);
		System.out.println(head.val);
		if (head.right != null)
			print(head.right);
	}
}
