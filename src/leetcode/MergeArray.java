package leetcode;

public class MergeArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 || j >= 0) {
        	if (i < 0) {
        		for (; j >= 0; j--)
        			nums1[j] = nums2[j];
        		return;
        	}
        	if (j < 0) 
        		return;
        	if (nums1[i] > nums2[j]) {
        		nums1[i + j + 1] = nums1[i];
        		i--;
        	} else {
        		nums1[i + j + 1] = nums2[j];
        		j--;
        	}
        }
    }
}
/*
public static void main(String[] args) {
int[] a = new int[] {1,2,3,0,0,0,0};
int[] b = new int[] {2,5,6};
MergeArray t = new MergeArray();
t.merge(a, 3, b, 3);
System.out.println(Arrays.toString(a));
}
*/