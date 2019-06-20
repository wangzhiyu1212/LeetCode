package leetcode;

import java.util.Arrays;

public class SortColors {
	public void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
	public void sortColors(int[] nums) {
        int p0 = 0, p2 = nums.length - 1, p1 = 0;
        while (p1 <= p2) {
        	if (nums[p1] == 0) {
        		swap(nums, p0, p1);
        		p1++;
        		p0++;
        	} else if (nums[p1] == 1) {
        		p1++;
        	} else {
        		swap(nums, p1, p2);
        		p2--;
        	}
        }
    }
}
/**
SortColors t = new SortColors();
int[] color = new int[] {2,0,2,1,1,0};
t.sortColors(color);
System.out.println(Arrays.toString(color));
*/