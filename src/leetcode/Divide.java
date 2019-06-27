package leetcode;

public class Divide {
	public int divide(int dividend, int divisor) {
        if (dividend == 0 || divisor == 0) return 0;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        int flag = ((dividend^divisor) < 0) ? -1: 1;
        long ans = 0 ;
        long t = 1;
        long abs1 = Math.abs((long)dividend), abs2 = Math.abs((long)divisor);
        while (abs1-abs2*t >= 0) {
        	abs1 = abs1 - abs2*t;
        	ans = ans + t;
        	t = t*2;
        }
        while (abs1-abs2 >= 0) {
        	if (abs1 - abs2*t >= 0) {
        		abs1 = abs1 - abs2*t;
        		ans = ans + t;
        	} else
        		t = t/2;
        }
        
        
        return (int)ans * flag;
    }
}
/*
Divide d = new Divide();
System.out.println(d.divide(Integer.MIN_VALUE, 1));
*/