package leetcode;

import java.util.Stack;

public class MaximalRectangle {
	public int largestRectangleArea(int[] heights) {
        Stack <Integer> stack = new Stack <Integer> ();
        stack.push(-1);
        int maxarea = 0;
        for (int i = 0; i < heights.length; ++i) {
            while (stack.peek() != -1 && heights[stack.peek()] >= heights[i])
                maxarea = Math.max(maxarea, heights[stack.pop()] * (i - stack.peek() - 1));
            stack.push(i);
        }
        while (stack.peek() != -1)
            maxarea = Math.max(maxarea, heights[stack.pop()] * (heights.length - stack.peek() -1));
        return maxarea;
    }
	public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int[] dp = new int[matrix[0].length];
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
        	for (int j = 0; j< matrix[0].length; j++) {
        		dp[j] = (matrix[i][j] == '1') ? dp[j] + 1 : 0;
        	}
        	max = Math.max(max, largestRectangleArea(dp));
        }
        return max;
    }
}
/*
public static void main(String[] args) {
MaximalRectangle t = new MaximalRectangle();
char[][] matrix = new char[][]{
	{'1','0','1','0','0'},
	{'1','0','1','1','1'},
	{'1','1','1','1','1'},
	{'1','0','0','1','0'}
	};
System.out.println(t.maximalRectangle(matrix)) ;
}
*/