package leetcode;

import java.util.Stack;

public class IsValid {
	public boolean isValid(String s) {
        if (s.length() == 0) return true;
        Stack<Character> stack = new Stack<Character>();
        for (int i=0; i<s.length(); i++) {
        	if(s.charAt(i) == ']') {
        		if (stack.empty() || stack.pop() != '[') return false;
        		else continue;
        	} else if (s.charAt(i) == ')') {
        		if (stack.empty() || stack.pop() != '(') return false;
        		else continue;
        	} else if (s.charAt(i) == '}') {
        		if (stack.empty() || stack.pop() != '{') return false;
        		else continue;
        	}
        	stack.push(s.charAt(i));
        }
        if (stack.empty()) return true;
        else return false;
    }
}
/*
IsValid a = new IsValid();
System.out.println(a.isValid("()[]{}"));
*/