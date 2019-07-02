package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Generate {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> out = new ArrayList<List<Integer>>();
        if (numRows == 0) return out;
        List<Integer> pre = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        pre.add(1);
        out.add(pre);
        for (int i = 2; i < numRows + 1; i++) {
        	list = new ArrayList<Integer>();
        	list.add(1);
        	for (int j = 1; j < i -1; j++) {
        		list.add(pre.get(j-1) + pre.get(j));
        	}
        	list.add(1);
        	out.add(list);
        	pre = list;
        }
        return out;
    }
	
	public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<Integer>();
        List<Integer> out = new ArrayList<Integer>();
        pre.add(1);
        for (int i = 0; i < rowIndex; i++) {
        	out = new ArrayList<Integer>();
        	out.add(1);
        	for (int j = 1; j < i + 1; j++) {
        		out.add(pre.get(j-1) + pre.get(j));
        	}
        	out.add(1);
        	pre = out;
        }
        return pre;
    }
}
/*
public static void main(String[] args) {
Generate t = new Generate();
for(List<Integer> list : t.generate(5))
	System.out.println(list.toString());
}
public static void main(String[] args) {
	Generate t = new Generate();
	System.out.println(t.getRow(4));
}
*/