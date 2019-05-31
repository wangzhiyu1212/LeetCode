package leetcode;

public class StrStr {
	public int strStr(String haystack, String needle) {
        char[] hayArr = haystack.toCharArray();
        char[] needArr = needle.toCharArray();
        int i = 0; //����(haystack)��λ��
        int j = 0; //ģʽ��(needle)��λ��
        while (i < hayArr.length && j < needArr.length) {
            if (hayArr[i] == needArr[j]) { // �������ַ������Ƚ���һ��
                i++;
                j++;
            } else {
                i = i - j + 1; // һ����ƥ�䣬i����
                j = 0; // j����
            }
        }
        if (j == needArr.length) { //˵����ȫƥ��
            return i - j;
        } else {
            return -1;
        }
    }
}
