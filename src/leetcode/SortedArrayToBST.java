package leetcode;

public class SortedArrayToBST {
	int[] nums;
	public TreeNode buildTree(int left, int right) {
		if (left > right)
			return null;
		int mid = (left + right)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = buildTree(left, mid - 1);
		root.right = buildTree(mid + 1, right);
		return root;
	}
	public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return buildTree(0, nums.length - 1);
    }
}
