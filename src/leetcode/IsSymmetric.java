package leetcode;

public class IsSymmetric {
	public boolean isMirror(TreeNode p, TreeNode q) {
		if (p == null && q == null) return true;
		if (p == null || q == null) return false;
		return p.val == q.val && isMirror(p.left, q.right) && isMirror(p.right, q.left);
	}
	public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
}
