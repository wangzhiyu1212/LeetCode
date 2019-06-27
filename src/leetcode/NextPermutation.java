package leetcode;

public class NextPermutation {
	private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
	private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
	public void nextPermutation(int[] nums) {
		if (nums.length < 2) return; 
		int i = nums.length - 2;
		while (i>=0 && nums[i] >= nums[i+1]) {
			i--;
		}
		if (i<0) {
			reverse(nums,0);
		} else {
			int j = nums.length - 1;
			while (j>=0 && nums[i]>=nums[j])
				j--;
			swap(nums,i,j);
			reverse(nums,i+1);
		}
    }
}
/*
int[] nums = new int[] {1,1};
for(int start=0,end=nums.length-1;start<end;start++,end--) {
    int temp = nums[start];
    nums[start] = nums[end];
    nums[end] = temp;
}
System.out.println(Arrays.toString(nums));
*/
