package leetcode;

public class HasPathSum {
	int target;
	boolean flag = false;
	public void recursive(TreeNode root, int sum) {
		if (root == null) return;
		int cur = sum + root.val;
		if (root.left == null && root.right == null) {
			if (cur == target)
				flag = true;
			return;
		}
		recursive(root.left, cur);
		recursive(root.right, cur);
	}
	public boolean hasPathSum(TreeNode root, int sum) {
        target = sum;
        recursive(root, 0);
        return flag;
    }
}
/*
public static void main(String[] args) {
HasPathSum t = new HasPathSum();
TreeNode t1 = new TreeNode(-2);
t1.right = new TreeNode(-3);
System.out.println(t.hasPathSum(t1, -5));
}
*/