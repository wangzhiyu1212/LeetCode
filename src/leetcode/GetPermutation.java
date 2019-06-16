package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GetPermutation {
	int fact(int n){
        if(n == 1 || n==0){
            return 1;
        }else{
            return n*fact(n - 1);
        }
    }
	public String getPermutation(int n, int k) {
        StringBuilder out = new StringBuilder();
        List<Integer> list = new ArrayList<Integer>();
        int N = n-1;
        for (int i=1; i<=n; i++) {
        	list.add(i);
        }
        for (int i=1; i<=n; i++) {
        	out.append(list.remove((k-1)/fact(N)));
        	if (k > fact(N))
        		k = k - (k-1)/fact(N)*fact(N);
        	N--;
        }
        return out.toString();
    }
}
/**
GetPermutation t = new GetPermutation();
System.out.println(t.getPermutation(8, 33));
*/