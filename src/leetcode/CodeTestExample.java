package leetcode;

import java.util.Arrays;
import java.util.List;

public class CodeTestExample {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(4);
		t1.left = new TreeNode(1);
		t1.right = t2;
		t2.left = new TreeNode(2);
		
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
	}
}

