package leetcode;

import java.util.Stack;

public class Trap {
	public int trap(int[] height) {
        int out=0;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i=0; i<height.length; i++) {
        	while (!stack.isEmpty() && height[i] >= height[stack.peek()]) {
        		int count = (i - stack.peek() -1) * height[stack.peek()];
        		stack.pop();
        		out += count;
        	}
        	stack.push(i);
        }
        
        return out;
    }
}
