package leetcode;

public class MaxPathSum {
	int max = Integer.MIN_VALUE;
	
	public int maxPath(TreeNode node) {
		if (node == null) return 0;
		int leftPath = Math.max(maxPath(node.left), 0);
		int rightPath = Math.max(maxPath(node.right), 0);
		int newPath = node.val + leftPath + rightPath;
		max = Math.max(max, newPath);
		
		return node.val + Math.max(leftPath, rightPath);
	}
	public int maxPathSum(TreeNode root) {
		maxPath(root);
		return max;
    }
	public static void main(String[] args) {
		BuildTree b = new BuildTree();
		TreeNode root = b.bulidTreeByLevel(new int[] {-10,9,20,0,0,15,7});
		MaxPathSum p = new MaxPathSum();
		System.out.println(p.maxPathSum(root));
	}
}
