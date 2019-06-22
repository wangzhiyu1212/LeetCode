package leetcode;

import java.util.Stack;

public class LargestRectangleArea {
	int[] heights;
	/** ·ÖÖÎ·¨ O(nlogn)*/
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
	/** Õ» O(n)*/
	public int largestRectangleArea2(int[] heights) {
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
	/** to research */
	public int largestRectangleArea3(int[] heights) {
        int length = heights.length;
        if(length == 0) return 0;
        int[] lessFromLeft = new int[length];
        int[] lessFromRight = new int[length];
        lessFromLeft[0] = -1;
        lessFromRight[length - 1] = length;
        for(int i = 1; i < length; i++) {
            int j = i - 1;
            for(; j >= 0 && heights[i] <= heights[j]; j = lessFromLeft[j]);
            lessFromLeft[i] = j;
        }
        for(int i = length - 2; i >= 0; i--) {
            int j = i + 1;
            for(; j < length && heights[i] <= heights[j]; j = lessFromRight[j]);
            lessFromRight[i] = j;
        }
        int max = 0;
        for(int i = 0; i < length; i++)
            max = Math.max(max, (lessFromRight[i] - lessFromLeft[i] - 1) * heights[i]);
        return max;
    }
}
/*
public static void main(String[] args) {
LargestRectangleArea t = new LargestRectangleArea();
System.out.println(t.largestRectangleArea2(new int[] {2,1,5,6,2,3})) ;
}
*/