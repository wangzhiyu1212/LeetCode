package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
	/** ¶ş²æÊ÷Ç°Ğò±éÀú */
	List<Integer> out = new ArrayList<Integer>();
	public List<Integer> preorderTraversal(TreeNode root) {
		if (root == null) return out;
		recursive(root);
		return out;
	}
	public void recursive(TreeNode head) {
		out.add(head.val);
		if (head.left != null)
			recursive(head.left);
		if (head.right != null)
			recursive(head.right);
	}
}
