package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FullJustify {
	List<String> out = new ArrayList<String>();
	public void addString (List<String> list, int maxWidth) {
		StringBuilder str = new StringBuilder();
		if (list.size() == 1) {
			str.append(list.get(0));
			for (int i=list.get(0).length(); i < maxWidth; i++)
				str.append(" ");
			out.add(str.toString());
		} else {
			int count = list.size() - 1;
			int size = list.size() - 1;
			int num = 0;
			for (String s : list) {
				num += s.length();
			}
			int numLeft = maxWidth - num;
			int offset = numLeft % size;
			while (count > 1) {
				str.append(list.remove(0));
				int minus = (maxWidth - num)/size + ((offset-- > 0) ? 1 : 0);
				for (int i=0; i < minus; i++)
					str.append(" ");
				numLeft -= minus;
				count--;
			}
			str.append(list.remove(0));
			for (int i=0; i < numLeft; i++)
				str.append(" ");
			str.append(list.remove(0));
			out.add(str.toString());
		}     		
	}
	public List<String> fullJustify(String[] words, int maxWidth) {
        StringBuilder str = new StringBuilder();
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
        	if (list.size() == 0) {
        		if (words[i].length() < maxWidth) {
            		str.append(words[i]);
            		list.add(words[i]);
            	} else if (words[i].length() == maxWidth) {
            		out.add(words[i]);
            	}
        	} else {
        		if (str.length() + words[i].length() + 1 < maxWidth) {
        			str.append(" " + words[i]);
        			list.add(words[i]);
        		} else if (str.length() + words[i].length() + 1 == maxWidth) {
        			str.append(" " + words[i]);
        			out.add(str.toString());
        			list.clear();
        			str.delete(0, str.length());
        		} else {
        			addString(list, maxWidth);	
        			str.delete(0, str.length());
        			list.clear();
        			str.append(words[i]);
        			list.add(words[i]);
        		}
        	}
        }
        if (list.size() > 0) {
        	str.delete(0, str.length());
            while (list.size() > 0) {
            	if (list.size() == 1)
            		str.append(list.remove(0));
            	else
            		str.append(list.remove(0) + " ");
            }
            int n = str.length();
            for (int i=0; i < maxWidth - n; i++)
    			str.append(" ");
            out.add(str.toString());
        }
		return out;
    }
}
/**
FullJustify t = new FullJustify();
String[] words = new String[] {"ask","not","what","your","country","can","do","for","you","ask","what","you","can","do","for","your","country"};
System.out.println(t.fullJustify(words, 16).toString());
*/