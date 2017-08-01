package leetcode;

import java.util.Arrays;

public class Median_of_Two_Sorted_Arrays {
	/**
	 * There are two sorted arrays nums1 and nums2 of size m and n respectively.

		Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
		
		Example 1:
		nums1 = [1, 3]
		nums2 = [2]
		
		The median is 2.0
		Example 2:
		nums1 = [1, 2]
		nums2 = [3, 4]
		
		The median is (2 + 3)/2 = 2.5
	 * @author werphy
	 *
	 */
	public class Solution {
	    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int[] term = new int[nums1.length + nums2.length];
	        int i = 0 ,j = 0;
	        int n = 0;
	        while(i < nums1.length || j < nums2.length)
	        {
	            if(i == nums1.length){
	                term[n++] = nums2[j++]; 
	            }
	            else if(j == nums2.length){
	                term[n++] = nums1[i++];
	            }
	            else{ 
	                term[n++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
	            }
	            
	        }
	        System.out.println(Arrays.toString(term));
	        System.out.println(n);
	        if(n%2 == 0){
	            return (double)(term[(n-1)/2] + term[(n-1)/2 + 1])/2;
	        }else{
	            return (double)term[(n-1)/2];
	        }
	        
	    }
	}
}
