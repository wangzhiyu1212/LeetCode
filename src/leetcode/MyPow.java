package leetcode;

public class MyPow {
	public double fastPow(double x, long n) {
		if (n == 0)
			return 1.0;
		double half = fastPow(x, n/2);
		if (n%2==0)
			return half*half;
		else 
			return half*half*x;
	}
	public double myPow(double x, int n) {
        long N = n;
        if (n < 0) {
        	x = 1/x;
        	N = -N;
        }
        return fastPow(x, N);
    }
}
/*
MyPow t = new MyPow();
System.out.println(t.myPow(2, -3));
*/