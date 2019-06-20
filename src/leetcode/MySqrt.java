package leetcode;

public class MySqrt {
	/** 二分法 */
	public int mySqrt(int x) {
		if (x == 1) return 1;
        long l = 0;
        long r = x/2;
        while (l < r) {
        	long mid = (l + r + 1)/2;
        	long square = mid * mid;
        	if (square <= x)
        		l = mid;
        	else 
        		r = mid - 1;
        }
        return (int)l;
    }
	/** 牛顿迭代法 */
	public int mySqrt2(int x) {
		if (x == 0) return 0;
		double cur = 1.0;
		while(true) {
			double p = cur;
			cur = (cur + x/cur)/2;
			if (Math.abs(p - cur) < 1e-2)
				return (int)cur;
		}
    }
}
/*
MySqrt t = new MySqrt();
System.out.println(t.mySqrt2(4));
*/