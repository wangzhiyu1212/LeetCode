package leetcode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BuildTree {
	int[] pre;
	int[] in;
	int[] post;
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	int pre_index = 0;
	int post_index = 0;
	/** 前序和中序生成二叉树 */
	public TreeNode recursive(int left, int right) {
		if (left > right)
			return null;
		int val = pre[pre_index];
		int in_index = map.get(val);
		TreeNode root = new TreeNode(val);
		pre_index++;
		root.left = recursive(left, in_index - 1);
		root.right = recursive(in_index + 1, right);
		return root;
	}
	public TreeNode buildTreeByPreAndIn(int[] preorder, int[] inorder) {
        this.pre = preorder;
        this.in = inorder;
        for (int i = 0; i < inorder.length; i++)
        	map.put(inorder[i], i);
        return recursive(0, preorder.length - 1);
    }
	
	/** 中序和后序生成二叉树 */
	public TreeNode recursivePost(int left, int right) {
		if (left > right)
			return null;
		int val = post[post_index];
		int in_index = map.get(val);
		TreeNode root = new TreeNode(val);
		post_index--;
		root.right = recursivePost(in_index + 1, right);
		root.left = recursivePost(left, in_index - 1);
		return root;
	}
	public TreeNode buildTreeByInAndPost(int[] inorder, int[] postorder) {
        this.post = postorder;
        this.in = inorder;
        post_index = postorder.length - 1;
        for (int i = 0; i < inorder.length; i++)
        	map.put(inorder[i], i);
        return recursivePost(0, postorder.length - 1);
    }
	
	/** 按层生成二叉树 */
	public TreeNode bulidTreeByLevel(int[] level) {
		Queue<TreeNode> list = new LinkedList<TreeNode>();
		if (level.length == 0) return null;
		TreeNode root = new TreeNode(level[0]);
		list.add(root);
		for (int i = 1; i < level.length; i = i+2) {
			TreeNode node = list.poll();
			if (level[i] == 0) {
				node.left = null;
			} else {
				node.left = new TreeNode(level[i]);
				list.add(node.left);
			}
			if (level[i+1] == 0) 
				node.right = null;
			else {
				node.right = new TreeNode(level[i+1]);
				list.add(node.right);
			}
		}
		return root;
	}
}
/*
public static void main(String[] args) {
BuildTree t1 = new BuildTree();
TreeNode t2 = t1.buildTreeByPreAndIn(new int[] {3,9,20,15,7}, new int[] {9,3,15,20,7});
}
*/