package leetcode;

public class MinDepth {
	int min = Integer.MAX_VALUE;
	public void recursive(TreeNode root, int level) {
		if (root == null)
			return;
		if (root.left == null && root.right == null) {
			min = Math.min(min, level + 1);
			return;
		}
		recursive(root.left, level + 1);
		recursive(root.right, level + 1);
	}
	public int minDepth(TreeNode root) {
		if (root == null) return 0;
        recursive(root, 0);
        return min;
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
MinDepth l = new MinDepth();
System.out.println(l.minDepth(t1));
}
*/