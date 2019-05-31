package leetcode;

public class StrStr {
	public int strStr(String haystack, String needle) {
        char[] hayArr = haystack.toCharArray();
        char[] needArr = needle.toCharArray();
        int i = 0; //主串(haystack)的位置
        int j = 0; //模式串(needle)的位置
        while (i < hayArr.length && j < needArr.length) {
            if (hayArr[i] == needArr[j]) { // 当两个字符相等则比较下一个
                i++;
                j++;
            } else {
                i = i - j + 1; // 一旦不匹配，i后退
                j = 0; // j归零
            }
        }
        if (j == needArr.length) { //说明完全匹配
            return i - j;
        } else {
            return -1;
        }
    }
}
