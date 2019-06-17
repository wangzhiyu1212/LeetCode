package leetcode;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		int carry = 0;
		digits[digits.length-1]++;
        for (int i = digits.length-1; i >= 0; i--) {
        	digits[i] += carry;
        	if (digits[i] == 10) {
        		if (i == 0) {
        			int[] newDigits = new int[digits.length+1];
        			newDigits[0] = 1;
        			return newDigits;
        		}
        		digits[i] = 0;
        		carry = 1;
        	} else 
        		carry = 0;
        	if (carry == 0)
        		return digits;
        }
        return digits;
    }
}
