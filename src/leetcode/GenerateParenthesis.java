package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
	List<String> output = new ArrayList<String>();
	
	public void generation(String str, int l, int r) {
		if (l == 0 && r == 0) {
			output.add(str);
			return;
		}
		if (l > r)
			return;
		if (l > 0)
			generation(str+"(",l-1,r);
		if (r > 0)
			generation(str+")",l,r-1);
	}
	public List<String> generateParenthesis(int n) {
        if (n == 0) return output;
        generation("",n,n);
        
        return output;
    }
}
/*
GenerateParenthesis a = new GenerateParenthesis();
System.out.println(a.generateParenthesis(3).toString());
*/