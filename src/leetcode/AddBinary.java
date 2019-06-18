package leetcode;

public class AddBinary {
	public String addBinary(String a, String b) {
        if (a.length() > b.length()) 
        	return addBinary(b,a);
        int carry = 0;
        int lenA = a.length();
        int gap = b.length() - a.length();
        StringBuilder out = new StringBuilder();
        for (int i = gap + lenA -1; i >= gap; i--) {
        	int num = Character.getNumericValue(a.charAt(i-gap)) + Character.getNumericValue(b.charAt(i)) + carry;
        	if (num > 1 & i == 0) {
        		out.append(num-2);
        		out.append(1);
        		break;
        	}
        	carry = num/2;
        	num = num%2;
        	out.append(num);
        }
        for (int i = gap - 1; i >= 0; i--) {
        	int n = Character.getNumericValue(b.charAt(i)) + carry;
        	if (n > 1 & i == 0) {
        		out.append(n-2);
        		out.append(1);
        		break;
        	}
        	carry = n/2;
        	n = n%2;
        	out.append(n);
        }
        return out.reverse().toString();
    }
	public String addBinary2(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder out = new StringBuilder();
        while (i > -1 || j > -1) {
        	int abit = i > -1 ? a.charAt(i) - '0': 0;
        	int bbit = j > -1 ? b.charAt(j) - '0': 0;
        	int num = abit + bbit + carry;
        	carry = num/2;
        	num = num%2;
        	out.insert(0, num);
        	
        	i--;
        	j--;
        }
        if (carry == 1)
        	out.insert(0, 1);
        return out.toString();
    }
}
/**
AddBinary t = new AddBinary();
System.out.println(t.addBinary2("1111", "1111"));
*/