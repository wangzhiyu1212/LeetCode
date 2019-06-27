package leetcode;

public class SortArray {
	public int[] bubbleSort(int[] nums) {
        if (nums.length <= 1) return nums;
        int temp;
        for (int i=0; i<nums.length; i++) 
        	for (int j=0; j+i+1<nums.length; j++){
        		if (nums[j]>nums[j+1]) {
        			temp = nums[j];
        			nums[j] = nums[j+1];
        			nums[j+1] = temp;
        		}
        }
        return nums;
    }
	public int[] selectSort(int[] nums) {
        if (nums.length <= 1) return nums;
        int temp;
        for (int i=0; i<nums.length; i++) 
        	for (int j=i+1; j<nums.length; j++) {
        		if (nums[i]>nums[j]) {
        			temp = nums[i];
        			nums[i] = nums[j];
        			nums[j] = temp;
        		}
        	}
        return nums;
	}
	public int[] insertSort(int[] nums) {
        if (nums.length <= 1) return nums;
        int temp;
        for (int i=1; i<nums.length; i++) {
        	for (int j=i; j>0; j--) {
        		if (nums[j]<nums[j-1]) {
        			temp = nums[j];
        			nums[j] = nums[j-1];
        			nums[j-1] = temp;
        		}
        	} 	
        }
        return nums;
	}
	public int[] quickSort(int[] nums) {
		recursive(nums,0,nums.length-1);
		return nums;
	}
	public void recursive(int[] a, int left, int right) {
	    if (left >= right) return;
	    int key = a[left];
	    int p1 = left , p2 = right;
	    while (left < right) {
	    	while (left < right && key <= a[right])
	    		right--;
	    	a[left] = a[right];
	    	while (left < right && key >= a[left]) 
	    		left++;
	    	a[right] = a[left];
	    }
    	a[left] = key;
    	recursive(a,p1,right-1);
	    recursive(a,right+1,p2);
	}
}
/*
SortArray s = new SortArray();
System.out.println(Arrays.toString(s.quickSort(new int[] {-4,0,7,-4,9,-5,-4,0,-7,-1})));
*/

