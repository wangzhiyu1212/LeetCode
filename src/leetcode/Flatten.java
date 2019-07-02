package leetcode;

public class Flatten {
	public void flatten(TreeNode root) {
        TreeNode cur = root;
        while (cur != null) {
        	if (cur.left != null) {
        		TreeNode p = cur.left;
        		while (p.right != null) p = p.right;
        		p.right = cur.right;
        		cur.right = cur.left;
        		cur.left = null;
        	}
        	cur = cur.right;
        }
    }
}
