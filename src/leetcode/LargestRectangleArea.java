package leetcode;

import java.util.Stack;

public class LargestRectangleArea {
	int[] heights;
	/** ·ÖÖÎ·¨ */
	public int maxArea(int left, int right) {
		if (left > right)
			return 0;
		int min = left;
		for (int i = left; i <= right; i++) {
			if (heights[i] < heights[min])
				min = i;
		}
		int leftMax = maxArea(left, min-1);
		int rightMax = maxArea(min+1, right);
		return Math.max((right-left+1)*heights[min], Math.max(leftMax, rightMax));
	}
	public int largestRectangleArea(int[] heights) {
		this.heights = heights;
        return maxArea(0, heights.length-1);
    }
	/** Õ» */
	public int largestRectangleArea2(int[] heights) {
        Stack < Integer > stack = new Stack < > ();
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
}
