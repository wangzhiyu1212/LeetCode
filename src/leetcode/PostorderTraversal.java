package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {
	/** ¶ş²æÊ÷ºóĞò±éÀú */
	List<Integer> out = new ArrayList<Integer>();
	public List<Integer> postorderTraversal(TreeNode root) {
		if (root == null) return out;
		recursive(root);
		return out;
	}
	public void recursive(TreeNode head) {
		if (head.left != null)
			recursive(head.left);
		if (head.right != null)
			recursive(head.right);
		out.add(head.val);
	}
	public static void print(TreeNode head) {
		if (head.left != null)
			print(head.left);
		if (head.right != null)
			print(head.right);
		System.out.println(head.val);
	}
}
