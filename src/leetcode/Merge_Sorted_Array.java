package leetcode;

public class Merge_Sorted_Array {
	/**
	 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

	Note:
	You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.


	 * @author werphy
	 *
	 */
	public class Solution {
	    public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int[] term = new int[m+n];
	        int i = 0;
	        int m1 = 0,n1 = 0;
	        while(i<m+n){
	            if(m1 < m && n1< n){
	            term[i] = nums1[m1] < nums2[n1] ? nums1[m1++] : nums2[n1++];
	            }
	            else if(m1 >= m){
	                term[i] = nums2[n1++];
	            }
	            else if(n1 >= n){
	                term[i] = nums1[m1++];
	            }
	            i++;
	        }
	        for(int j = 0 ; j < m + n; j ++){
	            nums1[j]= term[j];
	        }
	        
	    }
	}
}
