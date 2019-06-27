package leetcode;

public class IsValidBST {
	/** 中序遍历判断大小 */
	long last = Long.MIN_VALUE;
	public boolean isValidBST(TreeNode root) {
        if (root == null)
        	return true;
        if (isValidBST(root.left)) {
        	if (root.val > last) {
        		last = root.val;
        		return isValidBST(root.right);
        	}
        }
        return false;
    }
}
