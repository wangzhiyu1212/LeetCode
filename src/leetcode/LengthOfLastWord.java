package leetcode;

public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
        boolean flag = false;
        int start=0,end=0;
        for (int i=s.length()-1; i>=0; i--) {
        	if (s.charAt(i) != ' ' && !flag) {
        		flag = true;
        		end = i;
        	}
        	if (s.charAt(i) == ' ' && flag) {
        		start = i;
        		break;
        	}
        	if (s.charAt(i) != ' ' && i==0)
        		start = -1;
        }
        
        return end-start;
    }
}
/*
LengthOfLastWord t = new LengthOfLastWord();
System.out.println(t.lengthOfLastWord("  "));
*/