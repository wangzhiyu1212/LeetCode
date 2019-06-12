package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> out = new ArrayList<List<String>>();
        HashMap<Character, Integer> cmap = new HashMap<Character, Integer>();
        HashMap<Long, List<String>> lmap = new HashMap<Long, List<String>>();
        Long count;
        cmap.put('a', 2);
        cmap.put('b', 3);
        cmap.put('c', 5);
        cmap.put('d', 7);
        cmap.put('e', 11);
        cmap.put('f', 13);
        cmap.put('g', 17);
        cmap.put('h', 19);
        cmap.put('i', 23);
        cmap.put('j', 29);
        cmap.put('k', 31);
        cmap.put('l', 37);
        cmap.put('m', 41);
        cmap.put('n', 43);
        cmap.put('o', 47);
        cmap.put('p', 53);
        cmap.put('q', 59);
        cmap.put('r', 61);
        cmap.put('s', 67);
        cmap.put('t', 71);
        cmap.put('u', 73);
        cmap.put('v', 79);
        cmap.put('w', 83);
        cmap.put('x', 89);
        cmap.put('y', 91);
        cmap.put('z', 101);
        for (String str: strs) {
        	count = Long.valueOf(1);
        	for (Character c: str.toCharArray()) {
        		count *= cmap.get(c);
        	}
        	List<String> l = lmap.getOrDefault(count, new ArrayList<String>());
        	l.add(str);
        	lmap.put(count, l);
        }
        for (List<String> list: lmap.values())
        	out.add(list);
        return out;
    }
}
