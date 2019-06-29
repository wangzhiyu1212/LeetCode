package leetcode;

public class SortedListToBST {
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
	public TreeNode sortedListToBST(ListNode head) {
		int length = 0, i = 0;
		ListNode node = head;
        while (node != null) {
        	length++;
        	node = node.next;
        }
        nums = new int[length];
        while (head != null) {
        	nums[i++] = head.val;
        	head = head.next;
        }
        return buildTree(0, nums.length - 1);
    }
}
