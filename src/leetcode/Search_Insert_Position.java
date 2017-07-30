package leetcode;

public class Search_Insert_Position {
	/**
	 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

		You may assume no duplicates in the array.
		
		Here are few examples.
		[1,3,5,6], 5 �� 2
		[1,3,5,6], 2 �� 1
		[1,3,5,6], 7 �� 4
		[1,3,5,6], 0 �� 0
	 * @author werphy
	 *
	 */
	public class Solution {
	    public int searchInsert(int[] nums, int target) {
	        if(target <= nums[0]){
	            return 0;
	        }
	        if(target > nums[nums.length-1]){
	            return nums.length;
	        } 
	        for (int i=1 ; i<nums.length; i++){
	            if(target <= nums[i] && target > nums[i-1])
	                return i;
	        }

	         return 0;
	    }
	}
}
