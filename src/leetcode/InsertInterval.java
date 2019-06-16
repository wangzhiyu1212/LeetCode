package leetcode;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
	public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> out = new ArrayList<int []>();
        int start=newInterval[0],end=newInterval[1],index=intervals.length;     
        for (int i=0; i<intervals.length; i++) {
        	if(newInterval[0] > intervals[i][1]) {
        		out.add(new int[]{intervals[i][0],intervals[i][1]});
        	} else if (newInterval[1] < intervals[i][0]) {
        		index = i;
        		break;
        	}
        	else {
        		start = Math.min(intervals[i][0], start);
        		end = Math.max(intervals[i][1], end);
        	}
        	
        }
        out.add(new int[]{start,end});
        for (int i=index; i<intervals.length; i++)
        	out.add(new int[]{intervals[i][0],intervals[i][1]});
        int[][] res = new int[out.size()][2];
        out.toArray(res);
        return res;
    }
}
