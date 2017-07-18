package leetcode;

import java.util.Arrays;

public class Missing_Number {
	/**
	 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
		
		For example,
		Given nums = [0, 1, 3] return 2.
	 * @author werphy
	 *
	 */
	public class Solution {
	    public int missingNumber(int[] nums) {
	        Arrays.sort(nums);
	        for(int i =0 ; i < nums.length-1 ;i++ ){
	            if(nums[i]+1 != nums[i+1])
	                return nums[i]+1;
	        }
	        return nums[0] ==0 ?  nums[nums.length-1]+1 : nums[0]-1;
	    }
	}
}
