package leetcode;

import java.util.Stack;

public class LongestValidParentheses {
	public int longestValidParentheses(String s) {
        if (s.length() == 0) return 0;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(-1);
        int maxl=0;
        for (int i=0; i<s.length(); i++) {
        	if (s.charAt(i) == '(')
        		stack.push(i);
        	else if (s.charAt(i) == ')') {
        		stack.pop();
        		if (stack.isEmpty()) {
        			stack.push(i);
        		} else {
        			maxl = Math.max(i - stack.peek(), maxl);
        		}

        	}
        }
        return maxl;
    }
}
/*
LongestValidParentheses a = new LongestValidParentheses();
System.out.println(a.longestValidParentheses("(()(((()"));
*/