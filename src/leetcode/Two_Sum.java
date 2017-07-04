package leetcode;
import java.util.HashMap;
import java.util.Map;
public class Two_Sum {
	/**
	 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	   You may assume that each input would have exactly one solution, and you may not use the same element twice.
	   Example:
	   Given nums = [2, 7, 11, 15], target = 9,
	   Because nums[0] + nums[1] = 2 + 7 = 9,
	   return [0, 1].
	 */
	public class Solution {
	    public int[] twoSum(int[] nums, int target) {
	        int[] result = new int[2];
	        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
	        for(int i=0;i<nums.length;i++){
	            if(m.containsKey(target-nums[i])){
	               result[0]=m.get(target-nums[i]);
	               result[1]=i;
	                return result;
	            }
	            m.put(nums[i],i);
	        }
	         return result;
	    }
	}
}
