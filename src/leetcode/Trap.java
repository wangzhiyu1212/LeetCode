package leetcode;

import java.util.Stack;

public class Trap {
	public int trap(int[] height) {
        int out=0,high=0,count;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i=0; i<height.length; i++) {
        	while (!stack.isEmpty() && height[i] >= height[stack.peek()]) {
        		count = (height[stack.peek()] - high) * (i - stack.peek() - 1);
        		out += count;
        		high = height[stack.pop()];
        	}
        	if (!stack.isEmpty()) {
        		count = (height[i] - high) * (i - stack.peek() - 1);
        		out += count;
        	}
        	high = 0;
        	stack.push(i);
        }
        return out;
    }
}
