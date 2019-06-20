package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MinWindow {
	public String minWindow(String s, String t) {
		if (t.length() == 0) return "";
        int l = 0, r = 0, snum = 0;
        int[] ans = new int[]{-1, 0, 0};
        Map<Character, Integer> tmap = new HashMap<Character, Integer>();
        Map<Character, Integer> smap = new HashMap<Character, Integer>();
        for (char c: t.toCharArray()) {
        	int count = tmap.getOrDefault(c, 0);
        	tmap.put(c, count+1);
        }
        int require = tmap.size();
        while (r < s.length()) {
        	int c = smap.getOrDefault(s.charAt(r), 0);
        	smap.put(s.charAt(r), c+1);
        	if (tmap.containsKey(s.charAt(r)) && tmap.get(s.charAt(r)).equals(smap.get(s.charAt(r)))) {
        		snum++;
        	}
        	while (l <= r && snum == require) {
        		if (ans[0] == -1 || ans[0] > r-l) {
        			ans[0] = r - l;
            		ans[1] = l;
            		ans[2] = r;
        		}
        		smap.put(s.charAt(l), smap.get(s.charAt(l)) - 1);
        		if (tmap.containsKey(s.charAt(l)) && smap.get(s.charAt(l)) < tmap.get(s.charAt(l))) {
            		snum--;
            	}
        		l++;
        	}
        	r++;
        }
        if (ans[0] == -1)
        	return "";
        else
        	return s.substring(ans[1], ans[2] + 1);
    }
}
/*
MinWindow t = new MinWindow();
System.out.println(t.minWindow("a", "a"));
*/