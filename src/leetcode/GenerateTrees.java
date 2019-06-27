package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateTrees {
	public List<TreeNode> recursive(int start, int end){
		List<TreeNode> out = new ArrayList<TreeNode>();
		if (start > end) {
			out.add(null);
			return out;
		}
		for (int i = start; i <= end; i++) {
			List<TreeNode> left = recursive(start, i-1);
			List<TreeNode> right = recursive(i+1, end);
			for (TreeNode l : left) {
				for (TreeNode r : right) {
					TreeNode node = new TreeNode(i);
					node.left = l;
					node.right = r;
					out.add(node);
				}
			}
		}
		return out;
	}
	public List<TreeNode> generateTrees(int n) {
        if (n < 1) return new ArrayList<>();
        return recursive(1, n);
    }
}
/*
public static void main(String[] args) {
GenerateTrees t = new GenerateTrees();
System.out.println(t.generateTrees(3).toString());
}
*/