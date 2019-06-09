package leetcode;

public class IsMatchWild {
	public boolean isMatch(String s, String p) {
		if (p.isEmpty()) return s.isEmpty();
		if (s.isEmpty()) {
			if (p.charAt(0) == '*')
				return isMatch(s, p.substring(1));
			else return false;
		}
		if (p.length() == 1) {
			if (p.charAt(0) == '*')
				return true;
			else
				return (s.length() == 1) &&(s.charAt(0) == p.charAt(0) || p.charAt(0) == '?');
        }
		if (p.charAt(0) == '*') {
			while (p.length()>1 && p.charAt(1) == '*') {
				p = p.substring(1);
				if (p.length() == 1 && p.charAt(0) == '*')
					return true;
			}
			for (int i=0; i<s.length(); i++) {
				if ((s.charAt(i) == p.charAt(1) || p.charAt(1) == '?') && isMatch(s.substring(i), p.substring(1)))
					return true;
			}	
		} else {
			return (s.charAt(0) == p.charAt(0) || p.charAt(0) == '?') && isMatch(s.substring(1),p.substring(1));
		}
		return false;
    }
}
