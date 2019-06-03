package codetest;

import java.util.HashMap;
import java.io.Serializable;

public class Test {
     
    public static void main(String[] args) {
    	HashMap<String,Integer> map = new HashMap<String,Integer>();
    	map.put("test", 1);
    	HashMap<String,Integer> m = new HashMap<String,Integer>();
    	
    	m.putAll(map);
    	map.put("test2", 2);
    	System.out.println(m);
    	System.out.println(map);
    	
    }
}