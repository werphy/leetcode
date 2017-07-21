package leetcode;

public class Max_Consecutive_Ones {
	public class Solution {
	    public int findMaxConsecutiveOnes(int[] nums) {
	        int n = 0;
	        int m = 0;
	        int num = 0;
	        if(nums == null)
	        return n;
	        
	        for(int i =0 ; i<nums.length; i++){
	            if(nums[i] == 1){
	                n++;
	            }
	            else if(nums[i] == 0){
	                if(m < n){
	                    m = n;
	                }   
	                n = 0;
	            }
	            
	        }
	        return m > n ? m : n;
	    }
	}
}
