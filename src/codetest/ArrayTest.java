package codetest;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayTest {
	public static void main(String[] args) {
		int[][] test = new int[][] {
			{2,3},{4,5},{6,7},{1,10}
		};
		Arrays.sort(test, new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[] b){
                return a[0]-b[0];
            }
		});
		for(int[] a:test)
			System.out.println(Arrays.toString(a));
	}
}
