package leetcode;
/**
 * LetterCombinations l = new LetterCombinations();
		System.out.println(l.letterCombinations("23").toString());
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
	Map<String, String> phone = new HashMap<String, String>(){/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{
	    put("2","abc");
	    put("3","def");
	    put("4","ghi");
	    put("5","jkl");
	    put("6", "mno");
	    put("7", "pqrs");
	    put("8", "tuv");
	    put("9", "wxyz");
	  }};
	List<String> output = new ArrayList<String>();
	
	public void combination(String c, String digit){
		if (digit.length() == 0) {
			output.add(c.toString());
			return ;
		}
		String str = phone.get(digit.substring(0, 1));
		for (int i=0; i<str.length(); i++) {
			String s = c+str.substring(i, i+1);
			
			combination(s,digit.substring(1));
		}
	}
	public List<String> letterCombinations(String digits) {
        if(digits.length() == 0)
        	return output;
        combination("",digits);
        return output;
    }
}
