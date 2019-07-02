package leetcode;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

public class Connect {
	/** 完整二叉树，递归 */
	public Node connect1(Node root) {
        if (root == null) return null;
        if (root.left != null) {
        	root.left.next = root.right;
        	if (root.next != null) root.right.next = root.next.left;
        }
        connect1(root.left);
        connect1(root.right);
        return root;
    }
	/** 不完整二叉树，从右子节点开始递归 */
	public void seek(Node cur, Node root) {
		root = root.next;
		while (root != null) {
			if (root.left != null) {
				cur.next = root.left;
				return ;
			}
			else if (root.right != null) {
				cur.next = root.right;
				return ;
			}
			root = root.next;
		}
	}
	public Node connect(Node root) {
		if (root == null) return null;
		if (root.left != null) {
			if (root.right != null) {
				root.left.next = root.right;
			} else
				seek(root.left, root);
		} 			
		if (root.right != null) 
			seek(root.right, root);
		connect(root.right);
		connect(root.left);
		return root;
	}
}
