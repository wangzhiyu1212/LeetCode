package leetcode;

public class IsNumber {
	public boolean isNumber(String s) {
        s = s.trim();
        boolean num = false;
        boolean e = false;
        boolean dot = false;
        for (int i=0; i<s.length(); i++) {
        	char c = s.charAt(i);
        	if (Character.isDigit(c))
        		num = true;
        	else if (c == '.') {
        		if (dot || e)
        			return false;
        		dot = true;
        	}
        	else if (c == 'e') {
        		if (e || !num)
        			return false;
        		e = true;
        		num = false;
        	}
        	else if (c == '+' || c== '-') {
        		if (i > 0 && s.charAt(i-1) != 'e')
        			return false;        		
        	}
        	else
        		return false;
        }
        return num;
    }
}
/**
IsNumber t = new IsNumber();
System.out.println(t.isNumber("-1"));
*/