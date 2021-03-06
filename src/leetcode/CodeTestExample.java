package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeTestExample {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(20);
		t1.left = new TreeNode(9);
		t1.right = t2;
		t2.left = new TreeNode(15);
		t2.right = new TreeNode(7);
		LevelOrder l = new LevelOrder();
		for(List<Integer> list : l.levelOrder(t1))
			System.out.println(list.toString());
		
		BuildTree b = new BuildTree();
		TreeNode root = b.bulidTreeByLevel(new int[] {5,4,8,11,0,13,4,7,2,0,0,5,1});
		PathSum p = new PathSum();
		for(List<Integer> list : p.pathSum(root, 22))
			System.out.println(list.toString());
		
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);
		RotateRight t = new RotateRight();
		l1 = t.rotateRight(l1, 5);
		while(l1 != null) {
			System.out.print(l1.val+"->");
			l1 = l1.next;
		}

		int[][] matrix = new int[][]{
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		
		Rotate r = new Rotate();
		r.rotate(matrix);
		for(int[] c:matrix)
			System.out.println(Arrays.toString(c));

		Combine c = new Combine();
		for(List<Integer> list : c.combine(4, 2))
			System.out.println(list.toString());
					
		Exist e = new Exist();
		char[][] board = new char[][] {
			{'A','B','C','E'},
			{'S','F','C','S'},
			{'A','D','E','E'}
		};
		e.exist(board, "ABC");
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(new ArrayList<Integer>(Arrays.asList(2)));
		list.add(new ArrayList<Integer>(Arrays.asList(3,4)));
		list.add(new ArrayList<Integer>(Arrays.asList(6,5,7)));
		list.add(new ArrayList<Integer>(Arrays.asList(4,1,8,3)));
		MinimumTotal m = new MinimumTotal();
		System.out.println(m.minimumTotal(list));
	}
}

