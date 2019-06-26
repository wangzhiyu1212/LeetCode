package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	List<Integer> out = new ArrayList<Integer>();
	/** 根据格雷码性质,G(i) = B(i+1) ^ B(i) */
	public List<Integer> grayCode(int n) {
        for (int i=0; i<Math.pow(2, n); i++) {
        	out.add((i>>1)^i);
        }
        return out;
    }
	/** 镜像映射 */
	public List<Integer> grayCode2(int n) {
        out.add(0);
        for (int i=0; i<n; i++) {
        	for (int j=out.size()-1; j>=0; j--) {
        		out.add(out.get(j)^(1<<i));
        	}
        }
        return out;
    }
}
/*
GrayCode t = new GrayCode();
System.out.println((t.grayCode2(1)).toString());
*/