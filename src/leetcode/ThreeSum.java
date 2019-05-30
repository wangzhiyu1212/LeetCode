package leetcode;
/**
 * List<List<Integer>> list = new ArrayList<List<Integer>>();
		ThreeSum t = new ThreeSum();
		list = t.threeSum(new int[] {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6});
		for(List l: list) {
			System.out.print(l.toString()+",");
		}
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (nums.length < 3) return list;
		List<Integer> l,last;
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++) {
        	if (i>0 && nums[i] == nums[i-1])
        		continue;
        	int left = i+1, right = nums.length-1;
        	while (left<right) {
        		if (nums[i]+nums[left]+nums[right] < 0) {
        			left++;
        			continue;
        		}
        		else if (nums[i]+nums[left]+nums[right] > 0) {
        			right--;
        			continue;
        		} else {
        			if (list.size()>0) {
        				last = list.get(list.size()-1);
        				if (nums[i] == last.get(0) && nums[left] == last.get(1)) {
        					left++;
        					continue;
        				}
        			}         				
        			l = new ArrayList<Integer>();
        			l.add(nums[i]);
        			l.add(nums[left]);
        			l.add(nums[right]);
        			list.add(l);
        			left++;
           		}
        	}
        }
        return list;
    }
}
