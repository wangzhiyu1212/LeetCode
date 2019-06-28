package leetcode;

public class RecoverTree {
	TreeNode firstNode = null;
	TreeNode secondNode = null;
	TreeNode preNode = new TreeNode(Integer.MIN_VALUE);
	/** 利用二叉树中序遍历有序性 */
	public void inorder(TreeNode node) {
		if (node == null)
			return;
		inorder(node.left);
		if (firstNode == null && preNode.val > node.val) firstNode = preNode;
		if (firstNode != null && preNode.val > node.val) secondNode = node;
		preNode = node;
		inorder(node.right);
	}
	public void recoverTree(TreeNode root) {
        inorder(root);
        int tmp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = tmp;
    }
}
/*
public static void main(String[] args) {
RecoverTree t = new RecoverTree();
TreeNode t1 = new TreeNode(3);
TreeNode t2 = new TreeNode(4);
t1.left = new TreeNode(1);
t1.right = t2;
t2.left = new TreeNode(2);
t.recoverTree(t1);
PreorderTraversal.print(t1);
}
*/