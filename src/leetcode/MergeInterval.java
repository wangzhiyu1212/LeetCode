package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {
	public int[][] merge(int[][] intervals) {
        if (intervals.length < 2)
        	return intervals;
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[] b){
                return a[0]-b[0];
            }
		});
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i=1; i<intervals.length; i++) {
        	if (end < intervals[i][0]) {
        		int[] tmp = new int[] {start,end};
        		list.add(tmp);
        		start = intervals[i][0];
        		end = intervals[i][1];
        	} else {
        		end = Math.max(intervals[i][1], end);
        	}
        }
        int[] tmp = new int[] {start,end};
		list.add(tmp);
        int[][] res = new int[list.size()][2];
        list.toArray(res);
        return res;
    }
}
/**
int[][] test = new int[][] {
			{2,3},{4,5},{6,7},{1,10}
		};
		MergeInterval t = new MergeInterval();
		for(int[] a:t.merge(test))
			System.out.println(Arrays.toString(a));
			*/
