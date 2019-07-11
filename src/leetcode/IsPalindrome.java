package leetcode;

public class IsPalindrome {
	/** Topic No.9 Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward */
	public boolean isPalindromeTopic9(int x) {
        if(x<0)
        	return false;

        int ans=0,carry,c=x;
        while (x != 0) {
        	carry = x%10;
        	x = x/10;
        	if(ans>Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 && x > Integer.MAX_VALUE%10)) return false;
        	ans = ans*10 + carry;
        }
        if (c==ans)return true;
        else return false;
    }
	
	/** Topic No.125 Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases. */
    public boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        int left = 0, right = c.length-1;
        while (left < right) {
        	while (left < right && !Character.isLetterOrDigit(c[left])) left++;
        	while (left < right && !Character.isLetterOrDigit(c[right])) right--;
        	if (Character.toUpperCase(c[left]) == Character.toUpperCase(c[right])) {
        		left++;
        		right--;
        	} else return false;
        }
        return true;
    }
    
	public static void main(String[] args) {
		/** Topic No.9 */
		IsPalindrome a = new IsPalindrome();
//		System.out.println(a.isPalindromeTopic9(2147483644));
		
		/** Topic No.125 */
		System.out.println(a.isPalindrome(".,"));
	}
}
