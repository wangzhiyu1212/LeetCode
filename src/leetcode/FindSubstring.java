package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSubstring {
	public List<Integer> findSubstring(String s, String[] words) {
		int count;
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        HashMap<String,Integer> m;
        List<Integer> list = new ArrayList<Integer>();
        if (words.length == 0) return list;
        int len = words[0].length();
        int num = words.length;
        for (String word:words) {
        	map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (int i=0; i+len<=s.length()&&(s.length()-i)>=num*len; i++) {
        	String str = s.substring(i, i+len);
        	if (map.containsKey(str)) {
        		m = new HashMap<String,Integer>();
            	m.putAll(map);
        		count = m.get(str);
        		if (count > 1)
        			m.put(str, count-1);
        		else
        			m.remove(str);
        		if (m.isEmpty()) {
        			list.add(i);
        			continue;
        		}
        		int j = i+len;
        		while (j+len-1<s.length() && m.containsKey(s.substring(j, j+len))) {
        			String s1 = s.substring(j, j+len);
        			count = m.get(s1);
        			if (count > 1)
            			m.put(s1, count-1);
            		else
            			m.remove(s1);
        			if (m.isEmpty()) {
            			list.add(i);
            			continue;
            		} else 
            			j = j+len;
        		}
        	}
        }
        return list;        
    }
	public List<Integer> findSubstring2(String s, String[] words) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        HashMap<String,Integer> smap = new HashMap<String,Integer>();
        List<Integer> list = new ArrayList<Integer>();
        if (words.length == 0) return list;
        int len = words[0].length();
        int num = words.length;
        for (String word:words) {
        	map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (int i=0; i+len<=s.length()&&(s.length()-i)>=num*len; i++) {
        	String str = s.substring(i, i+len);
        	if (map.containsKey(str)) {
        		smap.clear();
        		for(int j=i,nums=num; nums>0; nums--) {
        			smap.put(s.substring(j, j+len), smap.getOrDefault(s.substring(j, j+len), 0) + 1);
        			j=j+len;
        		}
        		boolean flag = true;
        		for (Map.Entry<String, Integer> entry : map.entrySet()) {
        			if (smap.get(entry.getKey()) == null || smap.get(entry.getKey()) != entry.getValue()) {
        				flag = false;
        				break;
        			}	
        		}
        		if (flag)
        			list.add(i);
        	}
        }
        return list;        
    }
}
/*
FindSubstring f = new FindSubstring();
String[] words = new String[] {"word","good","best","good"};
System.out.println(f.findSubstring2("wordgoodgoodgoodbestword", words).toString());
*/