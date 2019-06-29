package leetcode;

public class MaxDepth {
	int max = 0;
	public void recursive(TreeNode node, int level) {
		if (node == null) {
			max = Math.max(max, level);
			return ;
		}
		recursive(node.left, level + 1);
		recursive(node.right, level + 1);
	}
	public int maxDepth(TreeNode root) {
		recursive(root, 0);
		return max;
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
MaxDepth l = new MaxDepth();
System.out.println(l.maxDepth(t1));
}
*/