package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeTest {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("123");
		StringBuilder s1 = s;
		s1.append("45");
		String t = "123";
		String t1 = t;
		t1 = t1 + "45";
		System.out.println(t);
	}
}
